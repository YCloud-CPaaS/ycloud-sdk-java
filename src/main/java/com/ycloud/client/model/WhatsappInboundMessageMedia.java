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
 * When a message with media (&#x60;image&#x60; | &#x60;document&#x60; | &#x60;audio&#x60; | &#x60;video&#x60; | &#x60;sticker&#x60;) is received, the WhatsApp Business API client will download the media. Once the media is downloaded, a notification is sent to your Webhook. This message contains information that identifies the media object and enables you to find and download the object.
 */
@ApiModel(description = "When a message with media (`image` | `document` | `audio` | `video` | `sticker`) is received, the WhatsApp Business API client will download the media. Once the media is downloaded, a notification is sent to your Webhook. This message contains information that identifies the media object and enables you to find and download the object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappInboundMessageMedia {
  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_CAPTION = "caption";
  @SerializedName(SERIALIZED_NAME_CAPTION)
  private String caption;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_MIME_TYPE = "mime_type";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private String mimeType;

  public static final String SERIALIZED_NAME_SHA256 = "sha256";
  @SerializedName(SERIALIZED_NAME_SHA256)
  private String sha256;

  public WhatsappInboundMessageMedia() { 
  }

  public WhatsappInboundMessageMedia link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * The protocol and URL of the media.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The protocol and URL of the media.")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public WhatsappInboundMessageMedia caption(String caption) {
    
    this.caption = caption;
    return this;
  }

   /**
   * The provided caption for the media. Only present if specified.
   * @return caption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The provided caption for the media. Only present if specified.")

  public String getCaption() {
    return caption;
  }


  public void setCaption(String caption) {
    this.caption = caption;
  }


  public WhatsappInboundMessageMedia filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * Filename on the sender&#39;s device. This will only be present in &#x60;document&#x60; media messages.
   * @return filename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filename on the sender's device. This will only be present in `document` media messages.")

  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public WhatsappInboundMessageMedia id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the media. Can be used to delete the media if stored locally on the client.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the media. Can be used to delete the media if stored locally on the client.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public WhatsappInboundMessageMedia metadata(String metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Metadata pertaining to &#x60;sticker&#x60; media.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata pertaining to `sticker` media.")

  public String getMetadata() {
    return metadata;
  }


  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  public WhatsappInboundMessageMedia mimeType(String mimeType) {
    
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Mime type of the media.
   * @return mimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mime type of the media.")

  public String getMimeType() {
    return mimeType;
  }


  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  public WhatsappInboundMessageMedia sha256(String sha256) {
    
    this.sha256 = sha256;
    return this;
  }

   /**
   * Checksum.
   * @return sha256
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Checksum.")

  public String getSha256() {
    return sha256;
  }


  public void setSha256(String sha256) {
    this.sha256 = sha256;
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
  public WhatsappInboundMessageMedia putAdditionalProperty(String key, Object value) {
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
    WhatsappInboundMessageMedia whatsappInboundMessageMedia = (WhatsappInboundMessageMedia) o;
    return Objects.equals(this.link, whatsappInboundMessageMedia.link) &&
        Objects.equals(this.caption, whatsappInboundMessageMedia.caption) &&
        Objects.equals(this.filename, whatsappInboundMessageMedia.filename) &&
        Objects.equals(this.id, whatsappInboundMessageMedia.id) &&
        Objects.equals(this.metadata, whatsappInboundMessageMedia.metadata) &&
        Objects.equals(this.mimeType, whatsappInboundMessageMedia.mimeType) &&
        Objects.equals(this.sha256, whatsappInboundMessageMedia.sha256)&&
        Objects.equals(this.additionalProperties, whatsappInboundMessageMedia.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, caption, filename, id, metadata, mimeType, sha256, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappInboundMessageMedia {\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
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
    openapiFields.add("link");
    openapiFields.add("caption");
    openapiFields.add("filename");
    openapiFields.add("id");
    openapiFields.add("metadata");
    openapiFields.add("mime_type");
    openapiFields.add("sha256");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappInboundMessageMedia
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappInboundMessageMedia.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappInboundMessageMedia is not found in the empty JSON string", WhatsappInboundMessageMedia.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("link") != null && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if (jsonObj.get("caption") != null && !jsonObj.get("caption").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caption` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caption").toString()));
      }
      if (jsonObj.get("filename") != null && !jsonObj.get("filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filename").toString()));
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
      }
      if (jsonObj.get("mime_type") != null && !jsonObj.get("mime_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mime_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mime_type").toString()));
      }
      if (jsonObj.get("sha256") != null && !jsonObj.get("sha256").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sha256` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sha256").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappInboundMessageMedia.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappInboundMessageMedia' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappInboundMessageMedia> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappInboundMessageMedia.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappInboundMessageMedia>() {
           @Override
           public void write(JsonWriter out, WhatsappInboundMessageMedia value) throws IOException {
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
           public WhatsappInboundMessageMedia read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappInboundMessageMedia instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappInboundMessageMedia given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappInboundMessageMedia
  * @throws IOException if the JSON string is invalid with respect to WhatsappInboundMessageMedia
  */
  public static WhatsappInboundMessageMedia fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappInboundMessageMedia.class);
  }

 /**
  * Convert an instance of WhatsappInboundMessageMedia to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
