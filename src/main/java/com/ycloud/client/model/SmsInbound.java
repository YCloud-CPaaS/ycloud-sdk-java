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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.ycloud.client.JSON;

/**
 * Represents an inbound SMS message, which means a user replies to your message.
 */
@ApiModel(description = "Represents an inbound SMS message, which means a user replies to your message.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SmsInbound {
  public static final String SERIALIZED_NAME_ID = "id";
  /**
   * Unique ID of the message.
  **/
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FROM = "from";
  /**
   * The user&#39;s phone number who sent the message to your registered sender ID, formatted in [E.164](https://en.wikipedia.org/wiki/E.164) format.
  **/
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_TO = "to";
  /**
   * The receiver&#39;s phone number, which is one of your registered Sender IDs.
  **/
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_TEXT = "text";
  /**
   * The text of this message.
  **/
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_SEND_TIME = "sendTime";
  /**
   * The time at which this message was sent, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
  **/
  @SerializedName(SERIALIZED_NAME_SEND_TIME)
  private Date sendTime;

  public SmsInbound() { 
  }

  public SmsInbound id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID of the message.
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  /**
   * Unique ID of the message.
   **/
  @ApiModelProperty(value = "Unique ID of the message.")
  public void setId(String id) {
    this.id = id;
  }


  public SmsInbound from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * The user&#39;s phone number who sent the message to your registered sender ID, formatted in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   * @return from
  **/
  @javax.annotation.Nullable

  public String getFrom() {
    return from;
  }


  /**
   * The user&#39;s phone number who sent the message to your registered sender ID, formatted in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   **/
  @ApiModelProperty(example = "+16315551111", value = "The user's phone number who sent the message to your registered sender ID, formatted in [E.164](https://en.wikipedia.org/wiki/E.164) format.")
  public void setFrom(String from) {
    this.from = from;
  }


  public SmsInbound to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * The receiver&#39;s phone number, which is one of your registered Sender IDs.
   * @return to
  **/
  @javax.annotation.Nullable

  public String getTo() {
    return to;
  }


  /**
   * The receiver&#39;s phone number, which is one of your registered Sender IDs.
   **/
  @ApiModelProperty(value = "The receiver's phone number, which is one of your registered Sender IDs.")
  public void setTo(String to) {
    this.to = to;
  }


  public SmsInbound text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * The text of this message.
   * @return text
  **/
  @javax.annotation.Nullable

  public String getText() {
    return text;
  }


  /**
   * The text of this message.
   **/
  @ApiModelProperty(value = "The text of this message.")
  public void setText(String text) {
    this.text = text;
  }


  public SmsInbound sendTime(Date sendTime) {
    
    this.sendTime = sendTime;
    return this;
  }

   /**
   * The time at which this message was sent, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
   * @return sendTime
  **/
  @javax.annotation.Nullable

  public Date getSendTime() {
    return sendTime;
  }


  /**
   * The time at which this message was sent, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
   **/
  @ApiModelProperty(example = "2022-06-01T12:00Z", value = "The time at which this message was sent, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., `2022-06-01T12:00:00.000Z`.")
  public void setSendTime(Date sendTime) {
    this.sendTime = sendTime;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public SmsInbound putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsInbound smsInbound = (SmsInbound) o;
    return Objects.equals(this.id, smsInbound.id) &&
        Objects.equals(this.from, smsInbound.from) &&
        Objects.equals(this.to, smsInbound.to) &&
        Objects.equals(this.text, smsInbound.text) &&
        Objects.equals(this.sendTime, smsInbound.sendTime)&&
        Objects.equals(this.additionalProperties, smsInbound.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, from, to, text, sendTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsInbound {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("from");
    openapiFields.add("to");
    openapiFields.add("text");
    openapiFields.add("sendTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SmsInbound
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SmsInbound.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SmsInbound is not found in the empty JSON string", SmsInbound.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("from") != null && !jsonObj.get("from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from").toString()));
      }
      if (jsonObj.get("to") != null && !jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if (jsonObj.get("text") != null && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SmsInbound.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SmsInbound' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SmsInbound> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SmsInbound.class));

       return (TypeAdapter<T>) new TypeAdapter<SmsInbound>() {
           @Override
           public void write(JsonWriter out, SmsInbound value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public SmsInbound read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SmsInbound instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SmsInbound given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SmsInbound
  * @throws IOException if the JSON string is invalid with respect to SmsInbound
  */
  public static SmsInbound fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SmsInbound.class);
  }

 /**
  * Convert an instance of SmsInbound to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

