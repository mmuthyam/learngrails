package com.mmuthyam

class Ticket {
    String ticketDescription
    String ticketTitle
    Date createdDate
    String createdBy
    
    static constraints = {
      ticketTitle(blank:false,nullable:false)
      ticketDescription(maxSize:1000)
    }
}
