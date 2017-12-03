//
// Return.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Model for testing reserved words */

open class Return: Codable {

    public var _return: Int?
    public var _returnNum: NSNumber? {
        get {
            return _return.map({ return NSNumber(value: $0) })
        }
    }


    
    public init(_return: Int?) {
        self._return = _return
    }
    

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {

        var container = encoder.container(keyedBy: String.self)

        try container.encodeIfPresent(_return, forKey: "return")
    }

    // Decodable protocol methods

    public required init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: String.self)

        _return = try container.decodeIfPresent(Int.self, forKey: "return")
    }
}

