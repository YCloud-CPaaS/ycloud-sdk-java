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
import com.ycloud.client.model.WhatsappTemplateComponentButton;
import com.ycloud.client.model.WhatsappTemplateComponentExample;
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
 * WhatsappTemplateComponentCardComponent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappTemplateComponentCardComponent {
  /**
   * **Required.** Card component type. - &#x60;BODY&#x60;: Body components are text-only components. Cards must have body text. - &#x60;HEADER&#x60;: Cards must have a media header (image or video). - &#x60;BUTTONS&#x60;: Buttons are interactive components that perform specific actions when tapped. Cards must have at least one button, up to 2 buttons.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BODY("BODY"),
    
    HEADER("HEADER"),
    
    BUTTONS("BUTTONS");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  /**
   * **Required.** Card component type. - &#x60;BODY&#x60;: Body components are text-only components. Cards must have body text. - &#x60;HEADER&#x60;: Cards must have a media header (image or video). - &#x60;BUTTONS&#x60;: Buttons are interactive components that perform specific actions when tapped. Cards must have at least one button, up to 2 buttons.
  **/
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * **Required for type &#x60;HEADER&#x60;.** Cards must have a media header (image or video).
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    IMAGE("IMAGE"),
    
    VIDEO("VIDEO");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FORMAT = "format";
  /**
   * **Required for type &#x60;HEADER&#x60;.** Cards must have a media header (image or video).
  **/
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private FormatEnum format;

  public static final String SERIALIZED_NAME_TEXT = "text";
  /**
   * **Required for type &#x60;BODY&#x60;.** Card body text supports variables. Maximum 160 characters.
  **/
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_BUTTONS = "buttons";
  /**
   * **Required for type &#x60;BUTTONS&#x60;.** Cards must have at least one button. Supports 2 buttons. Buttons can be the same or a mix of quick reply buttons, phone number buttons, or URL buttons.
  **/
  @SerializedName(SERIALIZED_NAME_BUTTONS)
  private List<WhatsappTemplateComponentButton> buttons = null;

  public static final String SERIALIZED_NAME_EXAMPLE = "example";
  /**
  **/
  @SerializedName(SERIALIZED_NAME_EXAMPLE)
  private WhatsappTemplateComponentExample example;

  public WhatsappTemplateComponentCardComponent() { 
  }

  public WhatsappTemplateComponentCardComponent type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * **Required.** Card component type. - &#x60;BODY&#x60;: Body components are text-only components. Cards must have body text. - &#x60;HEADER&#x60;: Cards must have a media header (image or video). - &#x60;BUTTONS&#x60;: Buttons are interactive components that perform specific actions when tapped. Cards must have at least one button, up to 2 buttons.
   * @return type
  **/
  @javax.annotation.Nullable

  public TypeEnum getType() {
    return type;
  }


  /**
   * **Required.** Card component type. - &#x60;BODY&#x60;: Body components are text-only components. Cards must have body text. - &#x60;HEADER&#x60;: Cards must have a media header (image or video). - &#x60;BUTTONS&#x60;: Buttons are interactive components that perform specific actions when tapped. Cards must have at least one button, up to 2 buttons.
   **/
  @ApiModelProperty(value = "**Required.** Card component type. - `BODY`: Body components are text-only components. Cards must have body text. - `HEADER`: Cards must have a media header (image or video). - `BUTTONS`: Buttons are interactive components that perform specific actions when tapped. Cards must have at least one button, up to 2 buttons.")
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public WhatsappTemplateComponentCardComponent format(FormatEnum format) {
    
    this.format = format;
    return this;
  }

   /**
   * **Required for type &#x60;HEADER&#x60;.** Cards must have a media header (image or video).
   * @return format
  **/
  @javax.annotation.Nullable

  public FormatEnum getFormat() {
    return format;
  }


  /**
   * **Required for type &#x60;HEADER&#x60;.** Cards must have a media header (image or video).
   **/
  @ApiModelProperty(value = "**Required for type `HEADER`.** Cards must have a media header (image or video).")
  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  public WhatsappTemplateComponentCardComponent text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * **Required for type &#x60;BODY&#x60;.** Card body text supports variables. Maximum 160 characters.
   * @return text
  **/
  @javax.annotation.Nullable

  public String getText() {
    return text;
  }


  /**
   * **Required for type &#x60;BODY&#x60;.** Card body text supports variables. Maximum 160 characters.
   **/
  @ApiModelProperty(value = "**Required for type `BODY`.** Card body text supports variables. Maximum 160 characters.")
  public void setText(String text) {
    this.text = text;
  }


  public WhatsappTemplateComponentCardComponent buttons(List<WhatsappTemplateComponentButton> buttons) {
    
    this.buttons = buttons;
    return this;
  }

  public WhatsappTemplateComponentCardComponent addButtonsItem(WhatsappTemplateComponentButton buttonsItem) {
    if (this.buttons == null) {
      this.buttons = new ArrayList<>();
    }
    this.buttons.add(buttonsItem);
    return this;
  }

   /**
   * **Required for type &#x60;BUTTONS&#x60;.** Cards must have at least one button. Supports 2 buttons. Buttons can be the same or a mix of quick reply buttons, phone number buttons, or URL buttons.
   * @return buttons
  **/
  @javax.annotation.Nullable

  public List<WhatsappTemplateComponentButton> getButtons() {
    return buttons;
  }


  /**
   * **Required for type &#x60;BUTTONS&#x60;.** Cards must have at least one button. Supports 2 buttons. Buttons can be the same or a mix of quick reply buttons, phone number buttons, or URL buttons.
   **/
  @ApiModelProperty(value = "**Required for type `BUTTONS`.** Cards must have at least one button. Supports 2 buttons. Buttons can be the same or a mix of quick reply buttons, phone number buttons, or URL buttons.")
  public void setButtons(List<WhatsappTemplateComponentButton> buttons) {
    this.buttons = buttons;
  }


  public WhatsappTemplateComponentCardComponent example(WhatsappTemplateComponentExample example) {
    
    this.example = example;
    return this;
  }

   /**
   * Get example
   * @return example
  **/
  @javax.annotation.Nullable

  public WhatsappTemplateComponentExample getExample() {
    return example;
  }


  /**
   **/
  @ApiModelProperty(value = "")
  public void setExample(WhatsappTemplateComponentExample example) {
    this.example = example;
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
  public WhatsappTemplateComponentCardComponent putAdditionalProperty(String key, Object value) {
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
    WhatsappTemplateComponentCardComponent whatsappTemplateComponentCardComponent = (WhatsappTemplateComponentCardComponent) o;
    return Objects.equals(this.type, whatsappTemplateComponentCardComponent.type) &&
        Objects.equals(this.format, whatsappTemplateComponentCardComponent.format) &&
        Objects.equals(this.text, whatsappTemplateComponentCardComponent.text) &&
        Objects.equals(this.buttons, whatsappTemplateComponentCardComponent.buttons) &&
        Objects.equals(this.example, whatsappTemplateComponentCardComponent.example)&&
        Objects.equals(this.additionalProperties, whatsappTemplateComponentCardComponent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, format, text, buttons, example, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappTemplateComponentCardComponent {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("format");
    openapiFields.add("text");
    openapiFields.add("buttons");
    openapiFields.add("example");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsappTemplateComponentCardComponent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WhatsappTemplateComponentCardComponent.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsappTemplateComponentCardComponent is not found in the empty JSON string", WhatsappTemplateComponentCardComponent.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("format") != null && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      if (jsonObj.get("text") != null && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      JsonArray jsonArraybuttons = jsonObj.getAsJsonArray("buttons");
      if (jsonArraybuttons != null) {
        // ensure the json data is an array
        if (!jsonObj.get("buttons").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `buttons` to be an array in the JSON string but got `%s`", jsonObj.get("buttons").toString()));
        }

        // validate the optional field `buttons` (array)
        for (int i = 0; i < jsonArraybuttons.size(); i++) {
          WhatsappTemplateComponentButton.validateJsonObject(jsonArraybuttons.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `example`
      if (jsonObj.getAsJsonObject("example") != null) {
        WhatsappTemplateComponentExample.validateJsonObject(jsonObj.getAsJsonObject("example"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsappTemplateComponentCardComponent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsappTemplateComponentCardComponent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsappTemplateComponentCardComponent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsappTemplateComponentCardComponent.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsappTemplateComponentCardComponent>() {
           @Override
           public void write(JsonWriter out, WhatsappTemplateComponentCardComponent value) throws IOException {
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
           public WhatsappTemplateComponentCardComponent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsappTemplateComponentCardComponent instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsappTemplateComponentCardComponent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsappTemplateComponentCardComponent
  * @throws IOException if the JSON string is invalid with respect to WhatsappTemplateComponentCardComponent
  */
  public static WhatsappTemplateComponentCardComponent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsappTemplateComponentCardComponent.class);
  }

 /**
  * Convert an instance of WhatsappTemplateComponentCardComponent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

