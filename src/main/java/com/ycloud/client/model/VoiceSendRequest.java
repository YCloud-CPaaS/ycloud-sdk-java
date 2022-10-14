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
 * VoiceSendRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoiceSendRequest {
  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_VERIFICATION_CODE = "verificationCode";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_CODE)
  private String verificationCode;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_CALLBACK_URL = "callbackUrl";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public VoiceSendRequest() { 
  }

  public VoiceSendRequest to(String to) {
    
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


  public VoiceSendRequest verificationCode(String verificationCode) {
    
    this.verificationCode = verificationCode;
    return this;
  }

   /**
   * The verification code to be sent, 4 to 6 digits.
   * @return verificationCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123456", required = true, value = "The verification code to be sent, 4 to 6 digits.")

  public String getVerificationCode() {
    return verificationCode;
  }


  public void setVerificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
  }


  public VoiceSendRequest language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * [ISO 639 Language Code](https://www.iso.org/iso-639-language-codes.html). If not specified, language will be set as &#x60;en&#x60; by default. Notably, in certain countries or regions, language will be automatically set as the local language due to the regional restrictions. Applicable languages: &#x60;ar&#x60;: Arabic &#x60;de&#x60;: German &#x60;en&#x60;: English &#x60;es&#x60;: Spanish &#x60;fr&#x60;: French &#x60;id&#x60;: Indonesian &#x60;it&#x60;: Italian &#x60;pt&#x60;: Portuguese &#x60;ru&#x60;: Russian &#x60;tr&#x60;: Turkish &#x60;vi&#x60;: Vietnamese &#x60;zh&#x60;: Chinese
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en", value = "[ISO 639 Language Code](https://www.iso.org/iso-639-language-codes.html). If not specified, language will be set as `en` by default. Notably, in certain countries or regions, language will be automatically set as the local language due to the regional restrictions. Applicable languages: `ar`: Arabic `de`: German `en`: English `es`: Spanish `fr`: French `id`: Indonesian `it`: Italian `pt`: Portuguese `ru`: Russian `tr`: Turkish `vi`: Vietnamese `zh`: Chinese")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public VoiceSendRequest externalId(String externalId) {
    
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


  public VoiceSendRequest callbackUrl(String callbackUrl) {
    
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Delivery report URL. You can provide a URL, and we will push the updated status report to your server in time. e.g., https://httpbin.org/anything?tag&#x3D;api. Note: We recommend configuring Webhook Endpoints instead.
   * @return callbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://httpbin.org/anything?tag=api-voice", value = "Delivery report URL. You can provide a URL, and we will push the updated status report to your server in time. e.g., https://httpbin.org/anything?tag=api. Note: We recommend configuring Webhook Endpoints instead.")

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
  public VoiceSendRequest putAdditionalProperty(String key, Object value) {
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
    VoiceSendRequest voiceSendRequest = (VoiceSendRequest) o;
    return Objects.equals(this.to, voiceSendRequest.to) &&
        Objects.equals(this.verificationCode, voiceSendRequest.verificationCode) &&
        Objects.equals(this.language, voiceSendRequest.language) &&
        Objects.equals(this.externalId, voiceSendRequest.externalId) &&
        Objects.equals(this.callbackUrl, voiceSendRequest.callbackUrl)&&
        Objects.equals(this.additionalProperties, voiceSendRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, verificationCode, language, externalId, callbackUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoiceSendRequest {\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    verificationCode: ").append(toIndentedString(verificationCode)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
    openapiFields.add("to");
    openapiFields.add("verificationCode");
    openapiFields.add("language");
    openapiFields.add("externalId");
    openapiFields.add("callbackUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("to");
    openapiRequiredFields.add("verificationCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoiceSendRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoiceSendRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoiceSendRequest is not found in the empty JSON string", VoiceSendRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VoiceSendRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("to") != null && !jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if (jsonObj.get("verificationCode") != null && !jsonObj.get("verificationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verificationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verificationCode").toString()));
      }
      if (jsonObj.get("language") != null && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
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
       if (!VoiceSendRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoiceSendRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoiceSendRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoiceSendRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<VoiceSendRequest>() {
           @Override
           public void write(JsonWriter out, VoiceSendRequest value) throws IOException {
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
           public VoiceSendRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VoiceSendRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VoiceSendRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoiceSendRequest
  * @throws IOException if the JSON string is invalid with respect to VoiceSendRequest
  */
  public static VoiceSendRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoiceSendRequest.class);
  }

 /**
  * Convert an instance of VoiceSendRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

