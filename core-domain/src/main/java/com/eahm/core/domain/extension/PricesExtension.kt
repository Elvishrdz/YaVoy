package com.eahm.core.domain.extension

import com.eahm.core.domain.product.Currency
import com.eahm.core.domain.product.Prices
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*

val Prices.priceWithCurrency: String?
    get() = this.prices
        .find {
            it.id == this.activePriceId
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