package me.apoorvaagupta;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("inputMapper")
public interface InputMapper {

    @Select("SELECT * FROM Input")
    public List<Input> selectAllInputs();

    @Select("SELECT * FROM Input WHERE id = #{id}")
    public Input selectInput(@Param("id") int id);

    @Insert("INSERT INTO Input (id, input1, input2) VALUES (#{id},#{input1},#{input2});")
    public int insertInput(Input i);

}
