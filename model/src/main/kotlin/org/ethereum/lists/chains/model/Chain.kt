package org.ethereum.lists.chains.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Chain(
    val name: String,
    val shortName: String,
    val chain: String,
    val chainId: Long,
    val networkId: Long,
    val rpc: List<String>,
    val faucets: List<String>,
    val explorers: List<Explorer>?,
    val infoURL: String,
    val title: String?,
    val nativeCurrency: NativeCurrency
)0x763A9b98a73EA708c95778F18F3C3C6617666026

fun List<Chain>.filterEIP3019Explorers() = map { it.copy(explorers = it.explorers?.filterEIP3019()) }
