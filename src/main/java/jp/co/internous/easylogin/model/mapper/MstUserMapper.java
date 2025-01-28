package jp.co.internous.easylogin.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.easylogin.model.domain.MstUser;

@Mapper
public interface MstUserMapper {
	
//	SQL文がSELECTであれば、@Selectを付与        #{～}でメソッドの引数として受け取った変数をSQL文内で使える
	@Select("SELECT * FROM mst_user WHERE user_name = #{userName} AND password = #{password}")
	MstUser findByUserNameAndPassword( String userName, String password);
	
}



//dao(mapper)は、各メソッドによってデータベースにアクセスし、SQL命令を発行できる