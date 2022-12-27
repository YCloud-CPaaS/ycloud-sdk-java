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
 * Used to report restrictions imposed on a specific WABA, when that WABA violates [WhatsApp Business Platform policies](https://developers.facebook.com/docs/whatsapp/overview/policy-enforcement).
 */
@ApiModel(description = "Used to report restrictions imposed on a specific WABA, when that WABA violates [WhatsApp Business Platform policies](https://developers.facebook.com/docs/whatsapp/overview/policy-enforcement).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappBusinessAccountRestrictionInfo {
  /**
   * Restriction type.
   */
  @JsonAdapter(RestrictionTypeEnum.Adapter.class)
  public enum RestrictionTypeEnum {
    ADD_PHONE_NUMBER_ACTION("RESTRICTED_ADD_PHONE_NUMBER_ACTION"),
    
    BIZ_INITIATED_MESSAGING("RESTRICTED_BIZ_INITIATED_MESSAGING"),
    
    CUSTOMER_INITIATED_MESSAGING("RESTRICTED_CUSTOMER_INITIATED_MESSAGING");

    private String value;

    RestrictionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RestrictionTypeEnum fromValue(String value) {
      for (RestrictionTypeEnum b : RestrictionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RestrictionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RestrictionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RestrictionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RestrictionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESTRICTION_TYPE = "restrictionType";
  @SerializedName(SERIALIZED_NAME_RESTRICTION_TYPE)
  private RestrictionTypeEnum restrictionType;

  public static final String SERIALIZED_NAME_EXPIRATION = "expiration";
  @SerializedName(SERIALIZED_NAME_EXPIRATION)
  private Date expiration;

  public WhatsappBusinessAccountRestrictionInfo() { 
  }

  public WhatsappBusinessAccountRestrictionInfo restrictionType(RestrictionTypeEnum restrictionType) {
    
    this.restrictionType = restrictionType;
    return this;
  }

   /**
   * Restriction type.
   * @return restrictionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Restriction type.")

  public RestrictionTypeEnum getRestrictionType() {
    return restrictionType;
  }


  public void setRestrictionType(RestrictionTypeEnum restrictionType) {
    this.restrictionType = restrictionType;
  }


  public WhatsappBusinessAccountRestrictionInfo expiration(Date expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * The time at which this restriction expires, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., &#x60;2022-06-01T12:00:00.000Z&#x60;.
   * @return expiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-06-01T12:00Z", value = "The time at which this restriction expires, formatted in [RFC 3339](https://datatracker.ietf.org/doc/html/rfc3339). e.g., `2022-06-01T12:00:00.000Z`.")

  public Date getExpiration() {
    return expiration;
  }


  public void setExpiration(Date expiration) {
    this.expiration = expiration;
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
  public WhatsappBusinessAccountRestrictionInfo putAdditionalProperty(String key, Object value) {
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
    WhatsappBusinessAccountRestrictionInfo whatsappBusinessAccountRestrictionInfo = (WhatsappBusinessAccountRestrictionInfo) o;
    return Objects.equals(this.restrictionType, whatsappBusinessAccountRestrictionInfo.restrictionType) &&
        Objects.equals(this.expiration, whatsappBusinessAccountRestrictionInfo.expiration)&&
        Objects.equals(this.additionalProperties, whatsappBusinessAccountRestrictionInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restrictionType, expiration, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappBusinessAccountRestrictionInfo {\n");
    sb.append("    restrictionType: ").append(toIndentedString(restrictionType)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
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
    openapiFields.add("restrictionType");
    openapiFields.add("expiration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappBusinessAccountRestrictionInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappBusinessAccountRestrictionInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappBusinessAccountRestrictionInfo is not found in the empty JSON string", WhatsappBusinessAccountRestrictionInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("restrictionType") != null && !jsonObj.get("restrictionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `restrictionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("restrictionType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappBusinessAccountRestrictionInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappBusinessAccountRestrictionInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappBusinessAccountRestrictionInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappBusinessAccountRestrictionInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappBusinessAccountRestrictionInfo>() {
           @Override
           public void write(JsonWriter out, WhatsappBusinessAccountRestrictionInfo value) throws IOException {
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
           public WhatsappBusinessAccountRestrictionInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappBusinessAccountRestrictionInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappBusinessAccountRestrictionInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappBusinessAccountRestrictionInfo
  * @throws IOException if the JSON string is invalid with respect to WhatsappBusinessAccountRestrictionInfo
  */
  public static WhatsappBusinessAccountRestrictionInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappBusinessAccountRestrictionInfo.class);
  }

 /**
  * Convert an instance of WhatsappBusinessAccountRestrictionInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
