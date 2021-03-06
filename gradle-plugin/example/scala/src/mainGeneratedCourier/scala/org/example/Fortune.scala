

package org.example

import javax.annotation.Generated

import com.linkedin.data.DataMap
import com.linkedin.data.schema.DataSchema
import com.linkedin.data.schema.UnionDataSchema
import com.linkedin.data.template.Custom
import com.linkedin.data.template.DataTemplate
import com.linkedin.data.template.RecordTemplate
import com.linkedin.data.template.RequiredFieldNotPresentException
import com.linkedin.data.template.TemplateOutputCastException
import com.linkedin.data.template.UnionTemplate
import org.coursera.courier.templates.DataTemplates
import org.coursera.courier.templates.DataTemplates.DataConversion
import org.coursera.courier.templates.ScalaRecordTemplate
import org.coursera.courier.templates.ScalaArrayTemplate
import org.coursera.courier.templates.ScalaUnionTemplate
import org.coursera.courier.templates.ScalaEnumerationTemplate
import scala.runtime.ScalaRunTime
import com.linkedin.data.template.DataTemplateUtil
import com.linkedin.data.schema.RecordDataSchema
import com.linkedin.data.schema.DataSchemaConstants
import com.linkedin.data.ByteString
import com.linkedin.data.DataList
import scala.collection.JavaConverters._
import scala.collection.immutable.Iterable
import scala.collection.immutable.MapLike
import scala.collection.mutable.Builder
import scala.collection.generic.CanBuildFrom
import com.linkedin.data.schema.MapDataSchema
import com.linkedin.data.schema.ArrayDataSchema
import scala.collection.GenTraversable
import org.coursera.courier.codecs.InlineStringCodec
import org.coursera.courier.coercers.SingleElementCaseClassCoercer
import scala.language.implicitConversions

@Generated(value = Array("Fortune"), comments = "Courier Data Template.")
final class Fortune private (private val dataMap: DataMap)
  extends ScalaRecordTemplate(dataMap, Fortune.SCHEMA) with Product {
  Fortune // force static initialization
  import Fortune._

  lazy val message: String = obtainDirect(Fortune.Fields.message, classOf[java.lang.String])

  private def setFields(message: String): Unit = {

    putDirect(Fortune.Fields.message, classOf[java.lang.String], message)

  }

  override val productArity: Int = 1

  override def productElement(n: Int): Any =
    n match {

      case 0 => message
      case _ => throw new IndexOutOfBoundsException(n.toString)
    }

  override val productPrefix: String = "Fortune"

  override def canEqual(that: Any): Boolean = that.isInstanceOf[Fortune]

  override def hashCode: Int = ScalaRunTime._hashCode(this)

  override def equals(that: Any): Boolean = ScalaRunTime._equals(this, that)

  override def toString: String = ScalaRunTime._toString(this)

  override def copy(): Fortune = this

  def copy(message: String = this.message): Fortune = {
    val $dataMap = new DataMap
    val $result = new Fortune($dataMap)
    $result.setFields(message)
    $dataMap.makeReadOnly()
    $result
  }

  override def copy(dataMap: DataMap, conversion: DataConversion): Fortune = {
    new Fortune(DataTemplates.makeImmutable(dataMap, conversion))
  }

  override def clone(): Fortune = this
}

object Fortune {
  val SCHEMA = DataTemplateUtil.parseSchema("""{"type":"record","name":"Fortune","namespace":"org.example","fields":[{"name":"message","type":"string"}]}""").asInstanceOf[RecordDataSchema]

  private object Fields {

    val message = Fortune.SCHEMA.getField("message")
  }

  def apply(message: String): Fortune = {
    val $dataMap = new DataMap
    val $result = new Fortune($dataMap)
    $result.setFields(message)
    $dataMap.makeReadOnly()
    $result
  }

  def apply(dataMap: DataMap, conversion: DataConversion): Fortune = {
    new Fortune(DataTemplates.makeImmutable(dataMap, conversion))
  }

  def unapply(record: Fortune): Option[(String)] = {
    try {
      Some((record.message))
    } catch {
      case cast: TemplateOutputCastException => None
      case notPresent: RequiredFieldNotPresentException => None
    }
  }

}

