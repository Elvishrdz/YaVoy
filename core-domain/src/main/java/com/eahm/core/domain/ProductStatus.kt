package com.eahm.core.domain

enum class ProductStatus {
    UNDEFINED,   // undefined, not visible and not editable
    AVAILABLE,   // visible to everybody and available to order
    UNAVAILABLE, // visible to everybody but not available to order
    PRIVATE,     // not visible to everybody and not available to order
    BANNED,       // not visible to everybody and not available to order, provider owner can not perform any operation on this product (only on this status)
}