package in.ineuron.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.Model.Employee;
import in.ineuron.util.HibernateUtil;

public class EntityToDbRowApp {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSession();
		Employee employee = null;
		Transaction transaction = null;
		boolean flag = false;

		
			try {
				transaction = session.beginTransaction();
				employee = session.get(Employee.class,4);
				if (employee != null) {
					System.out.println(employee);
					employee.setEmpName("Revi");
					flag=true;
				}else {
					
					flag=false;
					System.out.println("Record not found");
					System.exit(0);
				}
				
				
				
			} catch (HibernateException e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Record not updated..");
				
			}finally {
				if (flag) {
					transaction.commit();
					System.out.println("Record updated...");
					}else {
						transaction.rollback();
						System.out.println("Record updation failed...");
					}
				}
			}
		
		 
	}

