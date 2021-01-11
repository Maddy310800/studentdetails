/**
 * 
 */
package com.studata.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studata.test.bean.Address;

/**
 * @author Madhaw Agrawal
 *
 */
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
