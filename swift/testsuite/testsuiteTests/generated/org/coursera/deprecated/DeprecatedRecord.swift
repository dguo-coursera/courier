import Foundation
import SwiftyJSON

@available(*, deprecated, message="Use XYZ instead")
public struct DeprecatedRecord: JSONSerializable {
    
    @available(*, deprecated)
    public let field1: String?
    
    @available(*, deprecated, message="Use XYZ instead")
    public let field2: String?
    
    public init(
        field1: String?,
        field2: String?
    ) {
        self.field1 = field1
        self.field2 = field2
    }
    
    public static func read(json: JSON) -> DeprecatedRecord {
        return DeprecatedRecord(
            field1: json["field1"].string,
            field2: json["field2"].string
        )
    }
    public func write() -> JSON {
        var json: [String : JSON] = [:]
        if let field1 = self.field1 {
            json["field1"] = JSON(field1)
        }
        if let field2 = self.field2 {
            json["field2"] = JSON(field2)
        }
        return JSON(json)
    }
}
