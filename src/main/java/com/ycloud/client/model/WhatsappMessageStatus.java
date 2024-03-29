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
 * WhatsApp message status. One of &#x60;accepted&#x60;, &#x60;failed&#x60;, &#x60;sent&#x60;, &#x60;delivered&#x60;, &#x60;read&#x60;. - &#x60;accepted&#x60;: The messaging request is accepted by our system. - &#x60;failed&#x60;: A message sent by your business failed to send. - &#x60;sent&#x60;: A message sent by your business is in transit within WhatsApp&#39;s systems. - &#x60;delivered&#x60;: A message sent by your business was delivered to the user&#39;s device. - &#x60;read&#x60;: A message sent by your business was read by the user.
 */
@JsonAdapter(WhatsappMessageStatus.Adapter.class)
public enum WhatsappMessageStatus {
  
  ACCEPTED("accepted"),
  
  FAILED("failed"),
  
  SENT("sent"),
  
  DELIVERED("delivered"),
  
  READ("read");

  private String value;

  WhatsappMessageStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WhatsappMessageStatus fromValue(String value) {
    for (WhatsappMessageStatus b : WhatsappMessageStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<WhatsappMessageStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final WhatsappMessageStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WhatsappMessageStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WhatsappMessageStatus.fromValue(value);
    }
  }
}

