package com.kuku.payment.domain

import jakarta.persistence.*

@Entity
class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id: Long? = null,

    val paymentAmount: Big
}