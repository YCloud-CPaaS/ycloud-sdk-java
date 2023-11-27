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
 * Supports several independent channels for verification: - &#x60;sms&#x60;: Sends an SMS message with a verification code. - &#x60;voice&#x60;: Makes a voice call with a verification code. - &#x60;email_code&#x60;: Sends an email with a verification code. - &#x60;whatsapp&#x60;: Sends a WhatsApp message with a verification code.
 */
@JsonAdapter(VerificationChannel.Adapter.class)
public enum VerificationChannel {
  
  SMS("sms"),
  
  VOICE("voice"),
  
  EMAIL_CODE("email_code"),
  
  WHATSAPP("whatsapp");

  private String value;

  VerificationChannel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VerificationChannel fromValue(String value) {
    for (VerificationChannel b : VerificationChannel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<VerificationChannel> {
    @Override
    public void write(final JsonWriter jsonWriter, final VerificationChannel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VerificationChannel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VerificationChannel.fromValue(value);
    }
  }
}

