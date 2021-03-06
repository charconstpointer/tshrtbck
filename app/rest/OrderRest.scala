package rest


import domain.Shirt
import play.api.libs.json.{Json}

case class OrderRest(name: String, age: Int, date: String, shirts: Seq[Shirt])


object OrderRest {
  implicit val orderFormat = Json.format[OrderRest]
  implicit val orderReads = Json.reads[OrderRest]
  implicit val orderWrites = Json.writes[OrderRest]
  //
  //  implicit val tsreads: Reads[Timestamp] = Reads.of[Long] map (new Timestamp(_))
  //  implicit val tswrites: Writes[Timestamp] = Writes { (ts: Timestamp) => JsString(ts.toString) }
}
