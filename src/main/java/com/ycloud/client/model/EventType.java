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
 * Type of webhook events.
 */
@JsonAdapter(EventType.Adapter.class)
public enum EventType {
  
  /**
   * Occurs when an email delivery status is updated, and the status changes to &#x60;delivered&#x60; or &#x60;failed&#x60;.
   */
  EMAIL_DELIVERY_UPDATED("email.delivery.updated"),
  
  /**
   * Occurs when an SMS message status is updated, and the status changes to &#x60;delivered&#x60; or &#x60;undelivered&#x60;.
   */
  SMS_MESSAGE_UPDATED("sms.message.updated"),
  
  /**
   * Occurs when a voice message status is updated, and the status changes to &#x60;delivered&#x60; or &#x60;undelivered&#x60;.
   */
  VOICE_MESSAGE_UPDATED("voice.message.updated"),
  
  /**
   * Occurs when a WhatsApp Business Account has been reviewed.
   */
  WHATSAPP_BUSINESS_ACCOUNT_REVIEWED("whatsapp.business_account.reviewed"),
  
  /**
   * Occurs when a policy violation happened, WhatsApp Business Account has been banned and more.
   */
  WHATSAPP_BUSINESS_ACCOUNT_UPDATED("whatsapp.business_account.updated"),
  
  /**
   * Occurs when a WhatsApp inbound message is received.
   */
  WHATSAPP_INBOUND_MESSAGE_RECEIVED("whatsapp.inbound_message.received"),
  
  /**
   * Occurs when a WhatsApp outbound message status is updated, and the status changes to &#x60;sent&#x60;, &#x60;failed&#x60;, &#x60;delivered&#x60;, or &#x60;read&#x60;.
   */
  WHATSAPP_MESSAGE_UPDATED("whatsapp.message.updated"),
  
  /**
   * Occurs when a WhatsApp business account phone number&#39;s name has been approved or rejected.
   */
  WHATSAPP_PHONE_NUMBER_NAME_UPDATED("whatsapp.phone_number.name_updated"),
  
  /**
   * Occurs when a WhatsApp business account phone number&#39;s quality-related status is updated, and the status changes to &#x60;GREEN&#x60;, &#x60;YELLOW&#x60;, or &#x60;RED&#x60;.
   */
  WHATSAPP_PHONE_NUMBER_QUALITY_UPDATED("whatsapp.phone_number.quality_updated"),
  
  /**
   * Occurs when a WhatsApp template status is updated, and the status changes to REJECTED, APPROVED, PAUSED, DISABLED, or IN_APPEAL.
   */
  WHATSAPP_TEMPLATE_REVIEWED("whatsapp.template.reviewed");

  private String value;

  EventType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventType fromValue(String value) {
    for (EventType b : EventType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EventType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EventType.fromValue(value);
    }
  }
}

