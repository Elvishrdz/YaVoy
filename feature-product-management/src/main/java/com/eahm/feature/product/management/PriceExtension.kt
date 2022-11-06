package com.eahm.feature.product.management

import com.eahm.feature.product.management.data.model.Currency
import com.eahm.feature.product.management.data.model.Price
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