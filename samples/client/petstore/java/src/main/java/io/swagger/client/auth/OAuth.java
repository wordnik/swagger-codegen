package io.swagger.client.auth;

import io.swagger.client.Pair;

import java.util.Map;
import java.util.List;

public class OAuth implements Authentication {
  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, Object> headerParams) {
    // TODO: support oauth
  }
}
