

public interface EmpDAO {
   /**
    * ���ڵ� ����
    * insert into emp(empno,ename,job,sal,hiredate)
    * values(?,?,?,?,sysdate)
    * */
	int empInsert(EmpDTO dto);
	
	/**
	 * empno(�����ȣ) �ߺ�üũ���
	 * @return : true�̸� �ߺ�, false�̸� ��밡��
	 * 
	 * select empno from emp where empno=?
	 * */
	boolean duplicateByEmpno(int empno) ;
	
	/**
	 * �����ȣ�� �ش��ϴ� ���ڵ� �˻�
	 *select empno, ename, job, sal, hiredate from emp where empno=? 
	 * */
	EmpDTO selectByEmpno(int empno);
	
	/**
	 * ��� ������� �˻��ϱ�
	 * select empno, ename, job, sal, hiredate from emp
	 * */
	 List<EmpDTO> selectAll();
	 
	 /**
	  * �����ȣ�� �ش��ϴ� ���ڵ� ����
	  *  delete from emp where empno=?
	  * */
	 int empDelete(int empno);
	 
	 /**
	  * �����ȣ�� �ش��ϴ� ������� �����ϱ�
	  *  ( ename, job, sal ����)
	  *  update emp 
	  *  set ename=? , job=? , sal=?
	  *  where empno=?
	  *  
	  * */
	 int empUpdate(EmpDTO dto);
}













