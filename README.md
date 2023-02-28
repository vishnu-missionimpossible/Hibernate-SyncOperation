# Hibernate-SyncOperation
1. With the help of L1-Cache Hibernate will acheive auto synchronization.
2. In the Entity to DB Row case. We are loading th object and  the setting up the value and then comitting without performing any CRUD operation. The same is reflecting in the Database table.
In the DB Row to Entity case. We are loading the object and then we are making the compiler to wait with the help of System.in.read(). In the mean time we are making changes in the Database. and then  if we comeback and execute the code, then updated value will  show if and only if we mention the session.refresh(obj) function. 
