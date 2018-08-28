package org.fkit.hrm.dao.provider;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;
import org.fkit.hrm.domain.Document;
import static org.fkit.hrm.util.common.HrmConstants.DOCUMENTTABLE;;

/**   
 * @Description: 文件上传动态SQL语句提供类
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */
public class DocumentDynaSqlProvider {
	// 分页动态查询
	public String selectWhitParam(Map<String, Object> params){
		String sql =  new SQL(){
			{
				SELECT("*");
				FROM(DOCUMENTTABLE);
				if(params.get("document") != null){
					Document document = (Document) params.get("document");
					if(document.getTitle() != null && !document.getTitle().equals("")){
						WHERE("  title LIKE CONCAT ('%',#{document.title},'%') ");
					}
				}
			}
		}.toString();
		
		if(params.get("pageModel") != null){
			sql += " limit #{pageModel.firstLimitParam} , #{pageModel.pageSize}  ";
		}
		
		return sql;
	}	
	// 动态查询总数量
	public String count(Map<String, Object> params){
		return new SQL(){
			{
				SELECT("count(*)");
				FROM(DOCUMENTTABLE);
				if(params.get("document") != null){
					Document document = (Document) params.get("document");
					if(document.getTitle() != null && !document.getTitle().equals("")){
						WHERE("  title LIKE CONCAT ('%',#{document.title},'%') ");
					}
				}
			}
		}.toString();
	}	
	// 动态插入
	public String insertDocument(Document document){
		
		return new SQL(){
			{
				INSERT_INTO(DOCUMENTTABLE);
				if(document.getTitle() != null && !document.getTitle().equals("")){
					VALUES("title", "#{title}");
				}
				if(document.getFileName() != null && !document.getFileName().equals("")){
					VALUES("filename", "#{fileName}");
				}
				if(document.getRemark() != null && !document.getRemark().equals("")){
					VALUES("remark", "#{remark}");
				}
				if(document.getUser() != null && document.getUser().getId() != null){
					VALUES("user_id", "#{user.id}");
				}
			}
		}.toString();
	}
	
	// 动态更新
	public String updateDocument(Document document){
		
		return new SQL(){
			{
				UPDATE(DOCUMENTTABLE);
				if(document.getTitle() != null && !document.getTitle().equals("")){
					SET(" title = #{title} ");
				}
				if(document.getFileName() != null && !document.getFileName().equals("")){
					SET(" filename = #{fileName} ");
				}
				if(document.getRemark() != null && !document.getRemark().equals("")){
					SET("remark = #{remark}");
				}
				if(document.getUser() != null && document.getUser().getId() != null){
					SET("user_id = #{user.id}");
				}
				WHERE(" id = #{id} ");
			}
		}.toString();
	}
	

}
