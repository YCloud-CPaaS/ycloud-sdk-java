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
 * Sms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Sms {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_SENDER_ID = "senderId";
  @SerializedName(SERIALIZED_NAME_SENDER_ID)
  private String senderId;

  public static final String SERIALIZED_NAME_REGION_CODE = "regionCode";
  @SerializedName(SERIALIZED_NAME_REGION_CODE)
  private String regionCode;

  public static final String SERIALIZED_NAME_TOTAL_SEGMENTS = "totalSegments";
  @SerializedName(SERIALIZED_NAME_TOTAL_SEGMENTS)
  private Integer totalSegments;

  public static final String SERIALIZED_NAME_TOTAL_PRICE = "totalPrice";
  @SerializedName(SERIALIZED_NAME_TOTAL_PRICE)
  private Double totalPrice;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  /**
   * Delivery status. One of &#x60;accepted&#x60;, &#x60;sent&#x60;, &#x60;delivered&#x60;, &#x60;undelivered&#x60;.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACCEPTED("accepted"),
    
    SENT("sent"),
    
    DELIVERED("delivered"),
    
    UNDELIVERED("undelivered");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Date createTime;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private Date updateTime;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_CALLBACK_URL = "callbackUrl";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public Sms() { 
  }

  public Sms id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID for the object.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique ID for the object.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Sms to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
   * @return to
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "+447901614024", required = true, value = "The recipient's phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public Sms text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * The text of this message.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Your verification code is 123456.", value = "The text of this message.")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public Sms senderId(String senderId) {
    
    this.senderId = senderId;
    return this;
  }

   /**
   * Sender ID to be used.
   * @return senderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "YCloud", value = "Sender ID to be used.")

  public String getSenderId() {
    return senderId;
  }


  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }


  public Sms regionCode(String regionCode) {
    
    this.regionCode = regionCode;
    return this;
  }

   /**
   * [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
   * @return regionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GB", value = "[ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)")

  public String getRegionCode() {
    return regionCode;
  }


  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }


  public Sms totalSegments(Integer totalSegments) {
    
    this.totalSegments = totalSegments;
    return this;
  }

   /**
   * Number of message segments. See [SMS character encoding](https://help.ycloud.com/en/articles/3083427-sms-character-encoding) for more info.
   * minimum: 1
   * @return totalSegments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Number of message segments. See [SMS character encoding](https://help.ycloud.com/en/articles/3083427-sms-character-encoding) for more info.")

  public Integer getTotalSegments() {
    return totalSegments;
  }


  public void setTotalSegments(Integer totalSegments) {
    this.totalSegments = totalSegments;
  }


  public Sms totalPrice(Double totalPrice) {
    
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Total price of this message.
   * @return totalPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0085", value = "Total price of this message.")

  public Double getTotalPrice() {
    return totalPrice;
  }


  public void setTotalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
  }


  public Sms currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Price currency. [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217).
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Price currency. [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217).")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Sms status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Delivery status. One of &#x60;accepted&#x60;, &#x60;sent&#x60;, &#x60;delivered&#x60;, &#x60;undelivered&#x60;.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sent", value = "Delivery status. One of `accepted`, `sent`, `delivered`, `undelivered`.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Sms errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Error code when the message is undeliverable.
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error code when the message is undeliverable.")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public Sms createTime(Date createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * The time at which this message was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-03-01T12:00:00.000Z&#x60;.
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-03-01T12:00Z", value = "The time at which this message was created, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., `2022-03-01T12:00:00.000Z`.")

  public Date getCreateTime() {
    return createTime;
  }


  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }


  public Sms updateTime(Date updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * The time at which the delivery report for this message was updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-03-01T12:00:00.000Z&#x60;.
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-03-01T12:00Z", value = "The time at which the delivery report for this message was updated, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., `2022-03-01T12:00:00.000Z`.")

  public Date getUpdateTime() {
    return updateTime;
  }


  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }


  public Sms externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * A unique string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems.
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique string to reference the object. This can be an order number or similar, and can be used to reconcile the object with your internal systems.")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public Sms callbackUrl(String callbackUrl) {
    
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Delivery report URL. You can provide a URL, and we will push the updated status report to your server in time. e.g., https://httpbin.org/anything?tag&#x3D;api. Note: We recommend configuring Webhook Endpoints instead.
   * @return callbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://httpbin.org/anything?tag=api-sms", value = "Delivery report URL. You can provide a URL, and we will push the updated status report to your server in time. e.g., https://httpbin.org/anything?tag=api. Note: We recommend configuring Webhook Endpoints instead.")

  public String getCallbackUrl() {
    return callbackUrl;
  }


  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
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
  public Sms putAdditionalProperty(String key, Object value) {
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
    Sms sms = (Sms) o;
    return Objects.equals(this.id, sms.id) &&
        Objects.equals(this.to, sms.to) &&
        Objects.equals(this.text, sms.text) &&
        Objects.equals(this.senderId, sms.senderId) &&
        Objects.equals(this.regionCode, sms.regionCode) &&
        Objects.equals(this.totalSegments, sms.totalSegments) &&
        Objects.equals(this.totalPrice, sms.totalPrice) &&
        Objects.equals(this.currency, sms.currency) &&
        Objects.equals(this.status, sms.status) &&
        Objects.equals(this.errorCode, sms.errorCode) &&
        Objects.equals(this.createTime, sms.createTime) &&
        Objects.equals(this.updateTime, sms.updateTime) &&
        Objects.equals(this.externalId, sms.externalId) &&
        Objects.equals(this.callbackUrl, sms.callbackUrl)&&
        Objects.equals(this.additionalProperties, sms.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, to, text, senderId, regionCode, totalSegments, totalPrice, currency, status, errorCode, createTime, updateTime, externalId, callbackUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sms {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    totalSegments: ").append(toIndentedString(totalSegments)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
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
    openapiFields.add("to");
    openapiFields.add("text");
    openapiFields.add("senderId");
    openapiFields.add("regionCode");
    openapiFields.add("totalSegments");
    openapiFields.add("totalPrice");
    openapiFields.add("currency");
    openapiFields.add("status");
    openapiFields.add("errorCode");
    openapiFields.add("createTime");
    openapiFields.add("updateTime");
    openapiFields.add("externalId");
    openapiFields.add("callbackUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("to");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Sms
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Sms.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Sms is not found in the empty JSON string", Sms.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Sms.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("to") != null && !jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if (jsonObj.get("text") != null && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if (jsonObj.get("senderId") != null && !jsonObj.get("senderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `senderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("senderId").toString()));
      }
      if (jsonObj.get("regionCode") != null && !jsonObj.get("regionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regionCode").toString()));
      }
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("errorCode") != null && !jsonObj.get("errorCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorCode").toString()));
      }
      if (jsonObj.get("externalId") != null && !jsonObj.get("externalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalId").toString()));
      }
      if (jsonObj.get("callbackUrl") != null && !jsonObj.get("callbackUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callbackUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callbackUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Sms.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Sms' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Sms> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Sms.class));

       return (TypeAdapter<T>) new TypeAdapter<Sms>() {
           @Override
           public void write(JsonWriter out, Sms value) throws IOException {
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
           public Sms read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Sms instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Sms given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Sms
  * @throws IOException if the JSON string is invalid with respect to Sms
  */
  public static Sms fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Sms.class);
  }

 /**
  * Convert an instance of Sms to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

