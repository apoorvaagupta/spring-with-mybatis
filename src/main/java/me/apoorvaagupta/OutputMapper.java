package me.apoorvaagupta;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("outputMapper")
public interface OutputMapper {

    @Select("SELECT * FROM Output")
    public List<Output> selectAllOutputs();

    @Select("SELECT * FROM Output WHERE id = #{id}")
    public Output selectOutput(@Param("id") int id);

    @Insert("INSERT INTO Output (id, output) VALUES (#{id},#{output});")
    public int insertOutput(Output o);

}

