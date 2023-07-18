package net.petrikainulainen.springbatch.xml.in;

import net.petrikainulainen.springbatch.student.StudentDTO;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * This class is used to set the actual parameter values of a
 * prepared statement.
 */
final class StudentPreparedStatementSetter implements ItemPreparedStatementSetter<StudentDTO> {
static int count=1;
    @Override
    public void setValues(StudentDTO student, PreparedStatement preparedStatement) throws SQLException {
        count++;
        preparedStatement.setString(1, student.getEmailAddress()+":"+count);
        preparedStatement.setString(2, student.getName()+":"+count);
        preparedStatement.setString(3, student.getPurchasedPackage()+":"+count);
    }
}
