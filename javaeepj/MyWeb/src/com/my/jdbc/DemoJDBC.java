package com.my.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DemoJDBC {
	public static final String URL = "jdbc:mysql://localhost:3306/ssmdemo";
    public static final String USER = "root";
    public static final String PASSWORD = "root";
    
    /**
     * ��ӵ�������
     */
    public void addUser(){
        //��ȡ����
        Connection conn = null;
        
        try {
            //1.������������
            Class.forName("org.gjt.mm.mysql.Driver");
            //2. ������ݿ�����
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        //sql
        String sql = "INSERT INTO user(id, username, password)"
                +" values (?,?,?)";
        PreparedStatement ptmt = null;
        try {
			ptmt = conn.prepareStatement(sql);//Ԥ����SQL������sqlִ��
		} catch (SQLException e1) {
			e1.printStackTrace();
		} 
        try {
			//����
			ptmt.setString(1, "qwerttyuiop12345");
			ptmt.setString(2, "test001");
			ptmt.setString(3, "111111");

			//ִ��
			ptmt.execute();
			System.out.println("������ݳɹ�");
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally{
			try {
				//�ر�PreparedStatement
				ptmt.close();
				//�ر�Connection
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
    }
    
    /**
     * ��������
     */
    public void updateUser(){
    	 //��ȡ����
        Connection conn = null;
        
        try {
            //1.������������
            Class.forName("org.gjt.mm.mysql.Driver");
            //2. ������ݿ�����
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        //sql, ÿ�мӿո�
        String sql = "UPDATE user"
               + " set username=?, password=?"
               + " where id=?";
        PreparedStatement ptmt = null;
        try {
			ptmt = conn.prepareStatement(sql);//Ԥ����SQL������sqlִ��
		} catch (SQLException e1) {
			e1.printStackTrace();
		} 
        try {
			//����
			ptmt.setString(1, "test002");
			ptmt.setString(2, "222222");
			ptmt.setString(3, "qwerttyuiop12345");

			//ִ��
			ptmt.execute();
			System.out.println("�������ݳɹ�");
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally{
			try {
				//�ر�PreparedStatement
				ptmt.close();
				//�ر�Connection
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
    }
    
    
    /**
     * ɾ������
     */
    public void delUser(){
    	 //��ȡ����
        Connection conn = null;
        
        try {
            //1.������������
            Class.forName("org.gjt.mm.mysql.Driver");
            //2. ������ݿ�����
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        //sql, ÿ�мӿո�
        String sql = "delete from user where id=?";
        PreparedStatement ptmt = null;
        try {
			ptmt = conn.prepareStatement(sql);//Ԥ����SQL������sqlִ��
		} catch (SQLException e1) {
			e1.printStackTrace();
		} 
        try {
			//����
			ptmt.setString(1, "qwerttyuiop12345");

			//ִ��
			ptmt.execute();
			System.out.println("ɾ�����ݳɹ�");
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally{
			try {
				//�ر�PreparedStatement
				ptmt.close();
				//�ر�Connection
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
    }
    
    /**
     * ��ȡ��������
     */
    public void getUser(){
    	 //��ȡ����
        Connection conn = null;
        
        try {
            //1.������������
            Class.forName("org.gjt.mm.mysql.Driver");
            //2. ������ݿ�����
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        //sql, ÿ�мӿո�
        String sql = "select * from user where id=?";
        PreparedStatement ptmt = null;
        try {
			ptmt = conn.prepareStatement(sql);//Ԥ����SQL������sqlִ��
		} catch (SQLException e1) {
			e1.printStackTrace();
		} 
        try {
			//����
			ptmt.setString(1, "qwerttyuiop12345");
			//ִ��
			ResultSet rs = ptmt.executeQuery();
			while(rs.next()){
				System.out.println("id:" + rs.getString("id") + "," + "username:" + rs.getString("username") + "," + "password:" + rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				//�ر�PreparedStatement
				ptmt.close();
				//�ر�Connection
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
    }
    
    /**
     * ��ȡ��������
     */
    public void getAll(){
    	 //��ȡ����
        Connection conn = null;
        
        try {
            //1.������������
            Class.forName("org.gjt.mm.mysql.Driver");
            //2. ������ݿ�����
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        //sql, ÿ�мӿո�
        String sql = "select * from user ";
        PreparedStatement ptmt = null;
		try {
			ptmt = conn.prepareStatement(sql);//Ԥ����SQL������sqlִ��
		} catch (SQLException e1) {
			e1.printStackTrace();
		} 
		ResultSet rs = null;
        try {
			//ִ��
			rs = ptmt.executeQuery();
			while(rs.next()){
				System.out.println("id : " + rs.getString("id") + " , " + "username : " + rs.getString("username") + " , " + "password : " + rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				//�ر�PreparedStatement
				ptmt.close();
				//�ر�Connection
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
    }
    
    /**
     * ��������Ӷ�������
     */
    public void addUserBatch(){
        //��ȡ����
        Connection conn = null;
        
        try {
            //1.������������
            Class.forName("org.gjt.mm.mysql.Driver");
            //2. ������ݿ�����
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        //sql
        String sql = "INSERT INTO user(id, username, password)"
                +" values (?,?,?)";
        PreparedStatement ptmt = null;
        try {
			ptmt = conn.prepareStatement(sql);//Ԥ����SQL������sqlִ��
		} catch (SQLException e1) {
			e1.printStackTrace();
		} 
        try {
			
			for(int i=0;i<11;i++){
				ptmt.setString(1, "qwerttyuiop12345_" + i);
				ptmt.setString(2, "test00_" + i);
				ptmt.setString(3, "11111" + i);
				ptmt.addBatch();
				if(i%2==0){
					//ִ����������
					ptmt.executeBatch();
					//�����������
					ptmt.clearBatch();
					System.out.println("������ݳɹ�");
				}
			}
			
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally{
			try {
				//�ر�PreparedStatement
				ptmt.close();
				//�ر�Connection
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
    }
    
    public static void main(String[] args) {
    	DemoJDBC demoJDBC = new DemoJDBC();
    	demoJDBC.getAll();
	}
}
