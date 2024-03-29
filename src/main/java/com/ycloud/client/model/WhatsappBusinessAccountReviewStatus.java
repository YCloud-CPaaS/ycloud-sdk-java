/*
 * YCloud API
 * The [YCloud](https://ycloud.com) API is organized around [REST](https://en.wikipedia.org/wiki/Representational_state_transfer). Our API is designed to have predictable, resource-oriented URLs, return [JSON](https://www.json.org) responses, and use standard HTTP response codes and verbs.
 *
 * The version of the OpenAPI document: v2
 * Contact: service@ycloud.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ycloud.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * WhatsApp Business Account review status.
 */
@JsonAdapter(WhatsappBusinessAccountReviewStatus.Adapter.class)
public enum WhatsappBusinessAccountReviewStatus {
  
  PENDING("PENDING"),
  
  APPROVED("APPROVED"),
  
  REJECTED("REJECTED");

  private String value;

  WhatsappBusinessAccountReviewStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WhatsappBusinessAccountReviewStatus fromValue(String value) {
    for (WhatsappBusinessAccountReviewStatus b : WhatsappBusinessAccountReviewStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<WhatsappBusinessAccountReviewStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final WhatsappBusinessAccountReviewStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WhatsappBusinessAccountReviewStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WhatsappBusinessAccountReviewStatus.fromValue(value);
    }
  }
}

