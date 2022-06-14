import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.Table

object Table2 : IntIdTable() {
//    val id = integer("id").autoIncrement()
    val number = integer("number").uniqueIndex()
    val tab1Id = integer("tab1_id").uniqueIndex().references(Table1.id)
//    override val primaryKey = PrimaryKey(id, name = "PK_Table2_Id")
}