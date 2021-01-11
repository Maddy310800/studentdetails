/**
 * 
 */
package com.studata.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studata.test.bean.Student;

/**
 * @author Madhaw Agrawal
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
