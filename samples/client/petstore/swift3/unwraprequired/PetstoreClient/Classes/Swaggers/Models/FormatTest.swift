//
// FormatTest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class FormatTest: JSONEncodable {

    public var integer: Int32?
    public var int32: Int32?
    public var int64: Int64?
    public var number: Double
    public var float: Float?
    public var double: Double?
    public var string: String?
    public var byte: Data
    public var binary: Data?
    public var date: ISOFullDate
    public var dateTime: Date?
    public var uuid: UUID?
    public var password: String


    public init(integer: Int32?=nil, int32: Int32?=nil, int64: Int64?=nil, number: Double, float: Float?=nil, double: Double?=nil, string: String?=nil, byte: Data, binary: Data?=nil, date: ISOFullDate, dateTime: Date?=nil, uuid: UUID?=nil, password: String) {
        self.integer = integer
        self.int32 = int32
        self.int64 = int64
        self.number = number
        self.float = float
        self.double = double
        self.string = string
        self.byte = byte
        self.binary = binary
        self.date = date
        self.dateTime = dateTime
        self.uuid = uuid
        self.password = password
    }
    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["integer"] = self.integer?.encodeToJSON()
        nillableDictionary["int32"] = self.int32?.encodeToJSON()
        nillableDictionary["int64"] = self.int64?.encodeToJSON()
        nillableDictionary["number"] = self.number
        nillableDictionary["float"] = self.float
        nillableDictionary["double"] = self.double
        nillableDictionary["string"] = self.string
        nillableDictionary["byte"] = self.byte.encodeToJSON()
        nillableDictionary["binary"] = self.binary?.encodeToJSON()
        nillableDictionary["date"] = self.date.encodeToJSON()
        nillableDictionary["dateTime"] = self.dateTime?.encodeToJSON()
        nillableDictionary["uuid"] = self.uuid?.encodeToJSON()
        nillableDictionary["password"] = self.password

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
