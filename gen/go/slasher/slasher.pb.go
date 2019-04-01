// Code generated by protoc-gen-go. DO NOT EDIT.
// source: slasher/slasher.proto

package slasher // import "github.com/taeho-io/idl/gen/go/slasher"

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import _ "google.golang.org/genproto/googleapis/api/annotations"

import (
	context "golang.org/x/net/context"
	grpc "google.golang.org/grpc"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

type SlashRequest struct {
	Text                 string   `protobuf:"bytes,1,opt,name=text,proto3" json:"text,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *SlashRequest) Reset()         { *m = SlashRequest{} }
func (m *SlashRequest) String() string { return proto.CompactTextString(m) }
func (*SlashRequest) ProtoMessage()    {}
func (*SlashRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_slasher_a1601de6693d8dda, []int{0}
}
func (m *SlashRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_SlashRequest.Unmarshal(m, b)
}
func (m *SlashRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_SlashRequest.Marshal(b, m, deterministic)
}
func (dst *SlashRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_SlashRequest.Merge(dst, src)
}
func (m *SlashRequest) XXX_Size() int {
	return xxx_messageInfo_SlashRequest.Size(m)
}
func (m *SlashRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_SlashRequest.DiscardUnknown(m)
}

var xxx_messageInfo_SlashRequest proto.InternalMessageInfo

func (m *SlashRequest) GetText() string {
	if m != nil {
		return m.Text
	}
	return ""
}

type SlashResponse struct {
	SlashedText          string   `protobuf:"bytes,1,opt,name=slashed_text,json=slashedText,proto3" json:"slashed_text,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *SlashResponse) Reset()         { *m = SlashResponse{} }
func (m *SlashResponse) String() string { return proto.CompactTextString(m) }
func (*SlashResponse) ProtoMessage()    {}
func (*SlashResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_slasher_a1601de6693d8dda, []int{1}
}
func (m *SlashResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_SlashResponse.Unmarshal(m, b)
}
func (m *SlashResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_SlashResponse.Marshal(b, m, deterministic)
}
func (dst *SlashResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_SlashResponse.Merge(dst, src)
}
func (m *SlashResponse) XXX_Size() int {
	return xxx_messageInfo_SlashResponse.Size(m)
}
func (m *SlashResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_SlashResponse.DiscardUnknown(m)
}

var xxx_messageInfo_SlashResponse proto.InternalMessageInfo

func (m *SlashResponse) GetSlashedText() string {
	if m != nil {
		return m.SlashedText
	}
	return ""
}

func init() {
	proto.RegisterType((*SlashRequest)(nil), "slasher.SlashRequest")
	proto.RegisterType((*SlashResponse)(nil), "slasher.SlashResponse")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// SlasherClient is the client API for Slasher service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type SlasherClient interface {
	Slash(ctx context.Context, in *SlashRequest, opts ...grpc.CallOption) (*SlashResponse, error)
}

type slasherClient struct {
	cc *grpc.ClientConn
}

func NewSlasherClient(cc *grpc.ClientConn) SlasherClient {
	return &slasherClient{cc}
}

func (c *slasherClient) Slash(ctx context.Context, in *SlashRequest, opts ...grpc.CallOption) (*SlashResponse, error) {
	out := new(SlashResponse)
	err := c.cc.Invoke(ctx, "/slasher.Slasher/Slash", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// SlasherServer is the server API for Slasher service.
type SlasherServer interface {
	Slash(context.Context, *SlashRequest) (*SlashResponse, error)
}

func RegisterSlasherServer(s *grpc.Server, srv SlasherServer) {
	s.RegisterService(&_Slasher_serviceDesc, srv)
}

func _Slasher_Slash_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(SlashRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SlasherServer).Slash(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/slasher.Slasher/Slash",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SlasherServer).Slash(ctx, req.(*SlashRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _Slasher_serviceDesc = grpc.ServiceDesc{
	ServiceName: "slasher.Slasher",
	HandlerType: (*SlasherServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Slash",
			Handler:    _Slasher_Slash_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "slasher/slasher.proto",
}

func init() { proto.RegisterFile("slasher/slasher.proto", fileDescriptor_slasher_a1601de6693d8dda) }

var fileDescriptor_slasher_a1601de6693d8dda = []byte{
	// 212 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x12, 0x2d, 0xce, 0x49, 0x2c,
	0xce, 0x48, 0x2d, 0xd2, 0x87, 0xd2, 0x7a, 0x05, 0x45, 0xf9, 0x25, 0xf9, 0x42, 0xec, 0x50, 0xae,
	0x94, 0x4c, 0x7a, 0x7e, 0x7e, 0x7a, 0x4e, 0xaa, 0x7e, 0x62, 0x41, 0xa6, 0x7e, 0x62, 0x5e, 0x5e,
	0x7e, 0x49, 0x62, 0x49, 0x66, 0x7e, 0x5e, 0x31, 0x44, 0x99, 0x92, 0x12, 0x17, 0x4f, 0x30, 0x48,
	0x61, 0x50, 0x6a, 0x61, 0x69, 0x6a, 0x71, 0x89, 0x90, 0x10, 0x17, 0x4b, 0x49, 0x6a, 0x45, 0x89,
	0x04, 0xa3, 0x02, 0xa3, 0x06, 0x67, 0x10, 0x98, 0xad, 0x64, 0xc4, 0xc5, 0x0b, 0x55, 0x53, 0x5c,
	0x90, 0x9f, 0x57, 0x9c, 0x2a, 0xa4, 0xc8, 0xc5, 0x03, 0x31, 0x3d, 0x25, 0x1e, 0x49, 0x31, 0x37,
	0x54, 0x2c, 0x24, 0xb5, 0xa2, 0xc4, 0x28, 0x90, 0x8b, 0x3d, 0x18, 0xe2, 0x00, 0x21, 0x37, 0x2e,
	0x56, 0x30, 0x53, 0x48, 0x54, 0x0f, 0xe6, 0x44, 0x64, 0x2b, 0xa5, 0xc4, 0xd0, 0x85, 0x21, 0xb6,
	0x28, 0xf1, 0x35, 0x5d, 0x7e, 0x32, 0x99, 0x89, 0x43, 0x88, 0x0d, 0xe2, 0x33, 0x27, 0x8d, 0x28,
	0xb5, 0xf4, 0xcc, 0x92, 0x8c, 0xd2, 0x24, 0xbd, 0xe4, 0xfc, 0x5c, 0xfd, 0x92, 0xc4, 0xd4, 0x8c,
	0x7c, 0xdd, 0xcc, 0x7c, 0xfd, 0xcc, 0x94, 0x1c, 0xfd, 0xf4, 0xd4, 0x3c, 0xfd, 0xf4, 0x7c, 0x58,
	0x08, 0x24, 0xb1, 0x81, 0xfd, 0x66, 0x0c, 0x08, 0x00, 0x00, 0xff, 0xff, 0x25, 0xd2, 0x17, 0xf6,
	0x1b, 0x01, 0x00, 0x00,
}
