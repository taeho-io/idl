// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/error_details.proto

package com.google.rpc;

/**
 * <pre>
 * Describes when the clients can retry a failed request. Clients could ignore
 * the recommendation here or retry when this information is missing from error
 * responses.
 * It's always recommended that clients should use exponential backoff when
 * retrying.
 * Clients should wait until `retry_delay` amount of time has passed since
 * receiving the error response before retrying.  If retrying requests also
 * fail, clients should use an exponential backoff scheme to gradually increase
 * the delay between retries based on `retry_delay`, until either a maximum
 * number of retires have been reached or a maximum retry delay cap has been
 * reached.
 * </pre>
 *
 * Protobuf type {@code google.rpc.RetryInfo}
 */
public  final class RetryInfo extends
    com.google.protobuf.GeneratedMessageLite<
        RetryInfo, RetryInfo.Builder> implements
    // @@protoc_insertion_point(message_implements:google.rpc.RetryInfo)
    RetryInfoOrBuilder {
  private RetryInfo() {
  }
  public static final int RETRY_DELAY_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration retryDelay_;
  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 1;</code>
   */
  @java.lang.Override
  public boolean hasRetryDelay() {
    return retryDelay_ != null;
  }
  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Duration getRetryDelay() {
    return retryDelay_ == null ? com.google.protobuf.Duration.getDefaultInstance() : retryDelay_;
  }
  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 1;</code>
   */
  private void setRetryDelay(com.google.protobuf.Duration value) {
    value.getClass();
  retryDelay_ = value;
    
    }
  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeRetryDelay(com.google.protobuf.Duration value) {
    value.getClass();
  if (retryDelay_ != null &&
        retryDelay_ != com.google.protobuf.Duration.getDefaultInstance()) {
      retryDelay_ =
        com.google.protobuf.Duration.newBuilder(retryDelay_).mergeFrom(value).buildPartial();
    } else {
      retryDelay_ = value;
    }
    
  }
  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 1;</code>
   */
  private void clearRetryDelay() {  retryDelay_ = null;
    
  }

  public static com.google.rpc.RetryInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.rpc.RetryInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.rpc.RetryInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.rpc.RetryInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.rpc.RetryInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.rpc.RetryInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.rpc.RetryInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.rpc.RetryInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.rpc.RetryInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.rpc.RetryInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.rpc.RetryInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.rpc.RetryInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.rpc.RetryInfo prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Describes when the clients can retry a failed request. Clients could ignore
   * the recommendation here or retry when this information is missing from error
   * responses.
   * It's always recommended that clients should use exponential backoff when
   * retrying.
   * Clients should wait until `retry_delay` amount of time has passed since
   * receiving the error response before retrying.  If retrying requests also
   * fail, clients should use an exponential backoff scheme to gradually increase
   * the delay between retries based on `retry_delay`, until either a maximum
   * number of retires have been reached or a maximum retry delay cap has been
   * reached.
   * </pre>
   *
   * Protobuf type {@code google.rpc.RetryInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.rpc.RetryInfo, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.rpc.RetryInfo)
      com.google.rpc.RetryInfoOrBuilder {
    // Construct using com.google.rpc.RetryInfo.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    @java.lang.Override
    public boolean hasRetryDelay() {
      return instance.hasRetryDelay();
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Duration getRetryDelay() {
      return instance.getRetryDelay();
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    public Builder setRetryDelay(com.google.protobuf.Duration value) {
      copyOnWrite();
      instance.setRetryDelay(value);
      return this;
      }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    public Builder setRetryDelay(
        com.google.protobuf.Duration.Builder builderForValue) {
      copyOnWrite();
      instance.setRetryDelay(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    public Builder mergeRetryDelay(com.google.protobuf.Duration value) {
      copyOnWrite();
      instance.mergeRetryDelay(value);
      return this;
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    public Builder clearRetryDelay() {  copyOnWrite();
      instance.clearRetryDelay();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.rpc.RetryInfo)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.rpc.RetryInfo();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "retryDelay_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.rpc.RetryInfo> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.rpc.RetryInfo.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.rpc.RetryInfo>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.rpc.RetryInfo)
  private static final com.google.rpc.RetryInfo DEFAULT_INSTANCE;
  static {
    RetryInfo defaultInstance = new RetryInfo();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      RetryInfo.class, defaultInstance);
  }

  public static com.google.rpc.RetryInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<RetryInfo> PARSER;

  public static com.google.protobuf.Parser<RetryInfo> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

