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
 * When a user messages businesses using call-to-actions buttons on [Ads that Click to WhatsApp](https://www.facebook.com/business/help/447934475640650) or a [Facebook Page call-to-action buttons](https://www.facebook.com/help/977869848936797), this field is included as an attachment.
 */
@ApiModel(description = "When a user messages businesses using call-to-actions buttons on [Ads that Click to WhatsApp](https://www.facebook.com/business/help/447934475640650) or a [Facebook Page call-to-action buttons](https://www.facebook.com/help/977869848936797), this field is included as an attachment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappInboundMessageReferral {
  public static final String SERIALIZED_NAME_SOURCE_URL = "source_url";
  @SerializedName(SERIALIZED_NAME_SOURCE_URL)
  private String sourceUrl;

  public static final String SERIALIZED_NAME_SOURCE_TYPE = "source_type";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
  private String sourceType;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_HEADLINE = "headline";
  @SerializedName(SERIALIZED_NAME_HEADLINE)
  private String headline;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_MEDIA_TYPE = "media_type";
  @SerializedName(SERIALIZED_NAME_MEDIA_TYPE)
  private String mediaType;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_VIDEO_URL = "video_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl;

  public static final String SERIALIZED_NAME_THUMBNAIL_URL = "thumbnail_url";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_URL)
  private String thumbnailUrl;

  public WhatsappInboundMessageReferral() { 
  }

  public WhatsappInboundMessageReferral sourceUrl(String sourceUrl) {
    
    this.sourceUrl = sourceUrl;
    return this;
  }

   /**
   * Specifies the URL that leads to the ad or post clicked by the user. Opening this URL takes you to the ad viewed by your user.
   * @return sourceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the URL that leads to the ad or post clicked by the user. Opening this URL takes you to the ad viewed by your user.")

  public String getSourceUrl() {
    return sourceUrl;
  }


  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }


  public WhatsappInboundMessageReferral sourceType(String sourceType) {
    
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Specifies the type of the ad&#39;s source. Supported values are \&quot;ad\&quot; or \&quot;post\&quot;.
   * @return sourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the type of the ad's source. Supported values are \"ad\" or \"post\".")

  public String getSourceType() {
    return sourceType;
  }


  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }


  public WhatsappInboundMessageReferral sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Specifies the Meta ID for an ad or post.
   * @return sourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the Meta ID for an ad or post.")

  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public WhatsappInboundMessageReferral headline(String headline) {
    
    this.headline = headline;
    return this;
  }

   /**
   * Specifies the headline used in the ad or post that generated the message.
   * @return headline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the headline used in the ad or post that generated the message.")

  public String getHeadline() {
    return headline;
  }


  public void setHeadline(String headline) {
    this.headline = headline;
  }


  public WhatsappInboundMessageReferral body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * The description, or body, from the ad or post that generated the message.
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description, or body, from the ad or post that generated the message.")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public WhatsappInboundMessageReferral mediaType(String mediaType) {
    
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Media present in the ad or post the user clicked. Supported values are \&quot;image\&quot; or \&quot;video\&quot;.
   * @return mediaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Media present in the ad or post the user clicked. Supported values are \"image\" or \"video\".")

  public String getMediaType() {
    return mediaType;
  }


  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  public WhatsappInboundMessageReferral imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * **Added if media_type is \&quot;image\&quot;.**  Contains a URL to the raw image.
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**Added if media_type is \"image\".**  Contains a URL to the raw image.")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public WhatsappInboundMessageReferral videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * **Added if media_type is \&quot;video\&quot;.**  Contains a URL to the video.
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**Added if media_type is \"video\".**  Contains a URL to the video.")

  public String getVideoUrl() {
    return videoUrl;
  }


  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }


  public WhatsappInboundMessageReferral thumbnailUrl(String thumbnailUrl) {
    
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

   /**
   * **Added if media_type is \&quot;video\&quot;.**  Contains a URL to the thumbnail image of the clicked video.
   * @return thumbnailUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**Added if media_type is \"video\".**  Contains a URL to the thumbnail image of the clicked video.")

  public String getThumbnailUrl() {
    return thumbnailUrl;
  }


  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
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
  public WhatsappInboundMessageReferral putAdditionalProperty(String key, Object value) {
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
    WhatsappInboundMessageReferral whatsappInboundMessageReferral = (WhatsappInboundMessageReferral) o;
    return Objects.equals(this.sourceUrl, whatsappInboundMessageReferral.sourceUrl) &&
        Objects.equals(this.sourceType, whatsappInboundMessageReferral.sourceType) &&
        Objects.equals(this.sourceId, whatsappInboundMessageReferral.sourceId) &&
        Objects.equals(this.headline, whatsappInboundMessageReferral.headline) &&
        Objects.equals(this.body, whatsappInboundMessageReferral.body) &&
        Objects.equals(this.mediaType, whatsappInboundMessageReferral.mediaType) &&
        Objects.equals(this.imageUrl, whatsappInboundMessageReferral.imageUrl) &&
        Objects.equals(this.videoUrl, whatsappInboundMessageReferral.videoUrl) &&
        Objects.equals(this.thumbnailUrl, whatsappInboundMessageReferral.thumbnailUrl)&&
        Objects.equals(this.additionalProperties, whatsappInboundMessageReferral.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceUrl, sourceType, sourceId, headline, body, mediaType, imageUrl, videoUrl, thumbnailUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappInboundMessageReferral {\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
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
    openapiFields.add("source_url");
    openapiFields.add("source_type");
    openapiFields.add("source_id");
    openapiFields.add("headline");
    openapiFields.add("body");
    openapiFields.add("media_type");
    openapiFields.add("image_url");
    openapiFields.add("video_url");
    openapiFields.add("thumbnail_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappInboundMessageReferral
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappInboundMessageReferral.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappInboundMessageReferral is not found in the empty JSON string", WhatsappInboundMessageReferral.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("source_url") != null && !jsonObj.get("source_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_url").toString()));
      }
      if (jsonObj.get("source_type") != null && !jsonObj.get("source_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_type").toString()));
      }
      if (jsonObj.get("source_id") != null && !jsonObj.get("source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_id").toString()));
      }
      if (jsonObj.get("headline") != null && !jsonObj.get("headline").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `headline` to be a primitive type in the JSON string but got `%s`", jsonObj.get("headline").toString()));
      }
      if (jsonObj.get("body") != null && !jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if (jsonObj.get("media_type") != null && !jsonObj.get("media_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `media_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("media_type").toString()));
      }
      if (jsonObj.get("image_url") != null && !jsonObj.get("image_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_url").toString()));
      }
      if (jsonObj.get("video_url") != null && !jsonObj.get("video_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `video_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("video_url").toString()));
      }
      if (jsonObj.get("thumbnail_url") != null && !jsonObj.get("thumbnail_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thumbnail_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thumbnail_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappInboundMessageReferral.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappInboundMessageReferral' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappInboundMessageReferral> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappInboundMessageReferral.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappInboundMessageReferral>() {
           @Override
           public void write(JsonWriter out, WhatsappInboundMessageReferral value) throws IOException {
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
           public WhatsappInboundMessageReferral read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappInboundMessageReferral instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappInboundMessageReferral given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappInboundMessageReferral
  * @throws IOException if the JSON string is invalid with respect to WhatsappInboundMessageReferral
  */
  public static WhatsappInboundMessageReferral fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappInboundMessageReferral.class);
  }

 /**
  * Convert an instance of WhatsappInboundMessageReferral to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
