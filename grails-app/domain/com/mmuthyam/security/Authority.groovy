package com.mmuthyam.security

import com.mmuthyam.security.Users

/**
 * Authority domain class.
 */
class Authority {

	static hasMany = [people: Users]

	/** description */
	String description
	/** ROLE String */
	String authority

	static constraints = {
		authority(blank: false, unique: true)
		description()
	}
}
