package com.marketfinance.app.utils

import com.marketfinance.app.ui.fragments.core.dashboard.WatchListData

object Defaults {

    const val roundLimit = 3
    const val nameSubstringLimit = 25
    const val newsSubstringLimit = 500
    const val aboutSummaryLimit = 600
    const val tickerDefaultAnimation = 300L
    const val marketStatusFrequency = 1000L
    const val priceAPIFrequency = 1000L
    const val chartAPIFrequency = 10000L
    const val optionsAPIFrequency = 5000L

    val defaultStocks = listOf(
        WatchListData("FB", "Facebook, Inc.", "Equity", 0.00, 0.00),
        WatchListData("AMZN", "Amazon.com, Inc.", "Equity", 0.00, 0.00),
        WatchListData("AAPL", "Apple Inc.", "Equity", 0.00, 0.00),
        WatchListData("NFLX", "Netflix, Inc.", "Equity", 0.00, 0.00),
        WatchListData("GOOG", "Advanced Micro Devices, Inc.", "Equity", 0.00, 0.00)
    )

    val defaultIndexes = listOf(
        WatchListData("^GSPC", "S&P 500", "Index", 0.00, 0.00),
        WatchListData("^DJI", "Dow Jones Industrial Average", "Index", 0.00, 0.00),
        WatchListData("^IXIC", "NASDAQ Composite", "Index", 0.00, 0.00),
        WatchListData("^RUT", "Russell 2000", "Index", 0.00, 0.00)
    )

    val searchQuoteTypeFilters = listOf(
        "Equity",
        "Index",
        "CRYPTOCURRENCY"
    )

}
