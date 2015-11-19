/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2015-11-16 19:10:01 UTC)
 * on 2015-11-25 at 05:03:48 UTC 
 * Modify at your own risk.
 */

package com.example.administrator.myapplication.backend.sendEKG.model;

/**
 * Model definition for DataSend.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the sendEKG. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataSend extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String data;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Float> ekgData;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float timestamp;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float x;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float y;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float z;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getData() {
    return data;
  }

  /**
   * @param data data or {@code null} for none
   */
  public DataSend setData(java.lang.String data) {
    this.data = data;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Float> getEkgData() {
    return ekgData;
  }

  /**
   * @param ekgData ekgData or {@code null} for none
   */
  public DataSend setEkgData(java.util.List<java.lang.Float> ekgData) {
    this.ekgData = ekgData;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getTimestamp() {
    return timestamp;
  }

  /**
   * @param timestamp timestamp or {@code null} for none
   */
  public DataSend setTimestamp(java.lang.Float timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getX() {
    return x;
  }

  /**
   * @param x x or {@code null} for none
   */
  public DataSend setX(java.lang.Float x) {
    this.x = x;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getY() {
    return y;
  }

  /**
   * @param y y or {@code null} for none
   */
  public DataSend setY(java.lang.Float y) {
    this.y = y;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getZ() {
    return z;
  }

  /**
   * @param z z or {@code null} for none
   */
  public DataSend setZ(java.lang.Float z) {
    this.z = z;
    return this;
  }

  @Override
  public DataSend set(String fieldName, Object value) {
    return (DataSend) super.set(fieldName, value);
  }

  @Override
  public DataSend clone() {
    return (DataSend) super.clone();
  }

}
