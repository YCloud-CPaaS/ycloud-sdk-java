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
import java.util.ArrayList;
import java.util.List;

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
 * **Required** when: - &#x60;type&#x60; is &#x60;HEADER&#x60;, and &#x60;format&#x60; is one of &#x60;IMAGE&#x60;, &#x60;VIDEO&#x60;, or &#x60;DOCUMENT&#x60;. Provide a sample media URL in &#x60;header_url&#x60;. - &#x60;type&#x60; is &#x60;HEADER&#x60;, &#x60;format&#x60; is &#x60;TEXT&#x60;, and a variable is used in &#x60;text&#x60;. Provide a sample value for that variable in &#x60;header_text&#x60;. There can be at most 1 variable in &#x60;HEADER&#x60; text. - &#x60;type&#x60; is &#x60;BODY&#x60;, and variables are used in &#x60;text&#x60;. Provide sample values for those variables in &#x60;body_text&#x60;.
 */
@ApiModel(description = "**Required** when: - `type` is `HEADER`, and `format` is one of `IMAGE`, `VIDEO`, or `DOCUMENT`. Provide a sample media URL in `header_url`. - `type` is `HEADER`, `format` is `TEXT`, and a variable is used in `text`. Provide a sample value for that variable in `header_text`. There can be at most 1 variable in `HEADER` text. - `type` is `BODY`, and variables are used in `text`. Provide sample values for those variables in `body_text`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappTemplateComponentExample {
  public static final String SERIALIZED_NAME_BODY_TEXT = "body_text";
  /**
   * Sample values for variables in &#x60;text&#x60; of a &#x60;BODY&#x60; component.
  **/
  @SerializedName(SERIALIZED_NAME_BODY_TEXT)
  private List<List<String>> bodyText = null;

  public static final String SERIALIZED_NAME_HEADER_TEXT = "header_text";
  /**
   * Sample value for the variable in &#x60;text&#x60; of a &#x60;HEADER&#x60; component.
  **/
  @SerializedName(SERIALIZED_NAME_HEADER_TEXT)
  private List<String> headerText = null;

  public static final String SERIALIZED_NAME_HEADER_URL = "header_url";
  /**
   * Sample media URL for a &#x60;HEADER&#x60; component whose format is one of &#x60;IMAGE&#x60;, &#x60;VIDEO&#x60;, or &#x60;DOCUMENT&#x60;. Supported types: - For &#x60;IMAGE&#x60;, the URL must end with one of &#x60;.jpg&#x60;, &#x60;.jpeg&#x60;, or &#x60;.png&#x60;, size limit is 5MB. - For &#x60;VIDEO&#x60;, the URL must end with &#x60;.mp4&#x60;, size limit is 16MB. - For &#x60;DOCUMENT&#x60;, the URL must end with &#x60;.pdf&#x60;, size limit is 100MB.
  **/
  @SerializedName(SERIALIZED_NAME_HEADER_URL)
  private List<String> headerUrl = null;

  public WhatsappTemplateComponentExample() { 
  }

  public WhatsappTemplateComponentExample bodyText(List<List<String>> bodyText) {
    
    this.bodyText = bodyText;
    return this;
  }

  public WhatsappTemplateComponentExample addBodyTextItem(List<String> bodyTextItem) {
    if (this.bodyText == null) {
      this.bodyText = new ArrayList<>();
    }
    this.bodyText.add(bodyTextItem);
    return this;
  }

   /**
   * Sample values for variables in &#x60;text&#x60; of a &#x60;BODY&#x60; component.
   * @return bodyText
  **/
  @javax.annotation.Nullable

  public List<List<String>> getBodyText() {
    return bodyText;
  }


  /**
   * Sample values for variables in &#x60;text&#x60; of a &#x60;BODY&#x60; component.
   **/
  @ApiModelProperty(value = "Sample values for variables in `text` of a `BODY` component.")
  public void setBodyText(List<List<String>> bodyText) {
    this.bodyText = bodyText;
  }


  public WhatsappTemplateComponentExample headerText(List<String> headerText) {
    
    this.headerText = headerText;
    return this;
  }

  public WhatsappTemplateComponentExample addHeaderTextItem(String headerTextItem) {
    if (this.headerText == null) {
      this.headerText = new ArrayList<>();
    }
    this.headerText.add(headerTextItem);
    return this;
  }

   /**
   * Sample value for the variable in &#x60;text&#x60; of a &#x60;HEADER&#x60; component.
   * @return headerText
  **/
  @javax.annotation.Nullable

  public List<String> getHeaderText() {
    return headerText;
  }


  /**
   * Sample value for the variable in &#x60;text&#x60; of a &#x60;HEADER&#x60; component.
   **/
  @ApiModelProperty(value = "Sample value for the variable in `text` of a `HEADER` component.")
  public void setHeaderText(List<String> headerText) {
    this.headerText = headerText;
  }


  public WhatsappTemplateComponentExample headerUrl(List<String> headerUrl) {
    
    this.headerUrl = headerUrl;
    return this;
  }

  public WhatsappTemplateComponentExample addHeaderUrlItem(String headerUrlItem) {
    if (this.headerUrl == null) {
      this.headerUrl = new ArrayList<>();
    }
    this.headerUrl.add(headerUrlItem);
    return this;
  }

   /**
   * Sample media URL for a &#x60;HEADER&#x60; component whose format is one of &#x60;IMAGE&#x60;, &#x60;VIDEO&#x60;, or &#x60;DOCUMENT&#x60;. Supported types: - For &#x60;IMAGE&#x60;, the URL must end with one of &#x60;.jpg&#x60;, &#x60;.jpeg&#x60;, or &#x60;.png&#x60;, size limit is 5MB. - For &#x60;VIDEO&#x60;, the URL must end with &#x60;.mp4&#x60;, size limit is 16MB. - For &#x60;DOCUMENT&#x60;, the URL must end with &#x60;.pdf&#x60;, size limit is 100MB.
   * @return headerUrl
  **/
  @javax.annotation.Nullable

  public List<String> getHeaderUrl() {
    return headerUrl;
  }


  /**
   * Sample media URL for a &#x60;HEADER&#x60; component whose format is one of &#x60;IMAGE&#x60;, &#x60;VIDEO&#x60;, or &#x60;DOCUMENT&#x60;. Supported types: - For &#x60;IMAGE&#x60;, the URL must end with one of &#x60;.jpg&#x60;, &#x60;.jpeg&#x60;, or &#x60;.png&#x60;, size limit is 5MB. - For &#x60;VIDEO&#x60;, the URL must end with &#x60;.mp4&#x60;, size limit is 16MB. - For &#x60;DOCUMENT&#x60;, the URL must end with &#x60;.pdf&#x60;, size limit is 100MB.
   **/
  @ApiModelProperty(value = "Sample media URL for a `HEADER` component whose format is one of `IMAGE`, `VIDEO`, or `DOCUMENT`. Supported types: - For `IMAGE`, the URL must end with one of `.jpg`, `.jpeg`, or `.png`, size limit is 5MB. - For `VIDEO`, the URL must end with `.mp4`, size limit is 16MB. - For `DOCUMENT`, the URL must end with `.pdf`, size limit is 100MB.")
  public void setHeaderUrl(List<String> headerUrl) {
    this.headerUrl = headerUrl;
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
  public WhatsappTemplateComponentExample putAdditionalProperty(String key, Object value) {
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
    WhatsappTemplateComponentExample whatsappTemplateComponentExample = (WhatsappTemplateComponentExample) o;
    return Objects.equals(this.bodyText, whatsappTemplateComponentExample.bodyText) &&
        Objects.equals(this.headerText, whatsappTemplateComponentExample.headerText) &&
        Objects.equals(this.headerUrl, whatsappTemplateComponentExample.headerUrl)&&
        Objects.equals(this.additionalProperties, whatsappTemplateComponentExample.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bodyText, headerText, headerUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappTemplateComponentExample {\n");
    sb.append("    bodyText: ").append(toIndentedString(bodyText)).append("\n");
    sb.append("    headerText: ").append(toIndentedString(headerText)).append("\n");
    sb.append("    headerUrl: ").append(toIndentedString(headerUrl)).append("\n");
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
    openapiFields.add("body_text");
    openapiFields.add("header_text");
    openapiFields.add("header_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappTemplateComponentExample
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappTemplateComponentExample.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappTemplateComponentExample is not found in the empty JSON string", WhatsappTemplateComponentExample.openapiRequiredFields.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("body_text") != null && !jsonObj.get("body_text").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `body_text` to be an array in the JSON string but got `%s`", jsonObj.get("body_text").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("header_text") != null && !jsonObj.get("header_text").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `header_text` to be an array in the JSON string but got `%s`", jsonObj.get("header_text").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("header_url") != null && !jsonObj.get("header_url").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `header_url` to be an array in the JSON string but got `%s`", jsonObj.get("header_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappTemplateComponentExample.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappTemplateComponentExample' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappTemplateComponentExample> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappTemplateComponentExample.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappTemplateComponentExample>() {
           @Override
           public void write(JsonWriter out, WhatsappTemplateComponentExample value) throws IOException {
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
           public WhatsappTemplateComponentExample read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappTemplateComponentExample instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappTemplateComponentExample given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappTemplateComponentExample
  * @throws IOException if the JSON string is invalid with respect to WhatsappTemplateComponentExample
  */
  public static WhatsappTemplateComponentExample fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappTemplateComponentExample.class);
  }

 /**
  * Convert an instance of WhatsappTemplateComponentExample to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

