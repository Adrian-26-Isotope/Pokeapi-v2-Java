package com.lodenrogue.pokeapiv2.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lodenrogue.pokeapiv2.model.APIResource;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public abstract class AbstractFacade<T> {

  private Class<T> entityClass;
  private ObjectMapper mapper;


  public AbstractFacade(final Class<T> entityClass) {
    this.entityClass = entityClass;
    this.mapper = new ObjectMapper();
    this.mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
  }

  protected abstract String getAddress();

  /**
   * Find entity by an identifier.
   */
  public T find(final Serializable id) {
    return findByUrl(getAddress() + "/" + id);
  }

  /**
   * Find entity by an ApiResource.
   */
  public T find(final APIResource apiResource) {
    return findByUrl(apiResource.getUrl());
  }

  /**
   * Find entity by an NamedApiResource.
   */
  public T find(final NamedAPIResource namedApiResource) {
    return findByUrl(namedApiResource.getUrl());
  }

  /**
   * Find entity by an url as String representation.
   */
  public T findByUrl(final String url) {
    try {
      return find(new URL(url));
    }
    catch (MalformedURLException e) {
      e.printStackTrace();
    }
    return null;
  }

  private T find(final URL url) {
    try {
      if (url != null) {
        URLConnection conn = url.openConnection();
        conn.setRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        T t = this.mapper.readValue(in, this.entityClass);
        in.close();
        return t;
      }
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

}
