package com.eahm.feature.product.management

import com.eahm.core.domain.Currency
import com.eahm.core.domain.Price
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*

fun Price.getPriceWithCurrency(): String? {
    return priceValues
        .find {
            it.id == this.currentPriceValueId
        }?.let {
            try {
                val nf = NumberFormat
                    .getNumberInstance(Locale.getDefault())

                nf.maximumFractionDigits = 2

                val df = nf as DecimalFormat

                StringBuilder()
                    .append(
                        when (it.currency) {
                            Currency.CORDOBA -> "C$"
                            Currency.DOLLAR -> "$"
                            Currency.EURO -> "€"
                        }
                    )
                    .append(" ")
                    .append(
                        df.format(it.value)
                    )
                    .toString()
            } catch (exception: TypeCastException) {
                null
            } catch (exception: RuntimeException) {
                null
            }
        }
}