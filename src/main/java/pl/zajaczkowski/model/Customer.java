package pl.zajaczkowski.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	
		@Id
		@GeneratedValue
	    private Long id;
	    private String name = null;
	    private Calendar customerSince = null;
	    
//	    public Customer() {
//	        super();
//	    }

	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
	        return this.name;
	    }
	    public void setName(final String name) {
	        this.name = name;
	    }

	    public Calendar getCustomerSince() {
	        return this.customerSince;
	    }
	    public void setCustomerSince(final Calendar customerSince) {
	        this.customerSince = customerSince;
	    }

}
