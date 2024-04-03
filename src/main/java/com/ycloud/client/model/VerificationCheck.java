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
import com.ycloud.client.model.VerificationChannel;
import com.ycloud.client.model.VerificationStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * VerificationCheck
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VerificationCheck {
  public static final String SERIALIZED_NAME_ID = "id";
  /**
   * ID of this verification check.
  **/
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_VALID = "valid";
  /**
   * Whether the verification code is valid for this check.
  **/
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public static final String SERIALIZED_NAME_STATUS = "status";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_STATUS)
  private VerificationStatus status;

  public static final String SERIALIZED_NAME_TO = "to";
  /**
   * The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format or email address.
  **/
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private VerificationChannel channel;

  public VerificationCheck() { 
  }

  public VerificationCheck id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of this verification check.
   * @return id
  **/
  @javax.annotation.Nonnull

  public String getId() {
    return id;
  }


  /**
   * ID of this verification check.
   **/
  @ApiModelProperty(example = "vc8f92c20", required = true, value = "ID of this verification check.")
  public void setId(String id) {
    this.id = id;
  }


  public VerificationCheck valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * Whether the verification code is valid for this check.
   * @return valid
  **/
  @javax.annotation.Nonnull

  public Boolean getValid() {
    return valid;
  }


  /**
   * Whether the verification code is valid for this check.
   **/
  @ApiModelProperty(example = "false", required = true, value = "Whether the verification code is valid for this check.")
  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  public VerificationCheck status(VerificationStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable

  public VerificationStatus getStatus() {
    return status;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setStatus(VerificationStatus status) {
    this.status = status;
  }


  public VerificationCheck to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format or email address.
   * @return to
  **/
  @javax.annotation.Nullable

  public String getTo() {
    return to;
  }


  /**
   * The recipient&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format or email address.
   **/
  @ApiModelProperty(example = "+16315551111", value = "The recipient's phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format or email address.")
  public void setTo(String to) {
    this.to = to;
  }


  public VerificationCheck channel(VerificationChannel channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable

  public VerificationChannel getChannel() {
    return channel;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setChannel(VerificationChannel channel) {
    this.channel = channel;
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
  public VerificationCheck putAdditionalProperty(String key, Object value) {
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
    VerificationCheck verificationCheck = (VerificationCheck) o;
    return Objects.equals(this.id, verificationCheck.id) &&
        Objects.equals(this.valid, verificationCheck.valid) &&
        Objects.equals(this.status, verificationCheck.status) &&
        Objects.equals(this.to, verificationCheck.to) &&
        Objects.equals(this.channel, verificationCheck.channel)&&
        Objects.equals(this.additionalProperties, verificationCheck.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, valid, status, to, channel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationCheck {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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
    openapiFields.add("valid");
    openapiFields.add("status");
    openapiFields.add("to");
    openapiFields.add("channel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("valid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VerificationCheck
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VerificationCheck.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerificationCheck is not found in the empty JSON string", VerificationCheck.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VerificationCheck.openapiRequiredFields) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VerificationCheck.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerificationCheck' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerificationCheck> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerificationCheck.class));

       return (TypeAdapter<T>) new TypeAdapter<VerificationCheck>() {
           @Override
           public void write(JsonWriter out, VerificationCheck value) throws IOException {
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
           public VerificationCheck read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VerificationCheck instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VerificationCheck given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VerificationCheck
  * @throws IOException if the JSON string is invalid with respect to VerificationCheck
  */
  public static VerificationCheck fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerificationCheck.class);
  }

 /**
  * Convert an instance of VerificationCheck to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

