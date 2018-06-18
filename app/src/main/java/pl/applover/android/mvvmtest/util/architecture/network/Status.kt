package pl.applover.android.mvvmtest.util.architecture.network

/**
 * Created by Ahmed Abd-Elmeged on 2/20/2018.
 */

enum class Status {
    RUNNING,
    SUCCESS,
    FAILED
}

@Suppress("DataClassPrivateConstructor")
data class NetworkState private constructor(
        val status: Status,
        val message: String? = null) {
    companion object {
        val LOADED = NetworkState(Status.SUCCESS)
        val LOADING = NetworkState(Status.RUNNING)
        fun error(msg: String? = null) = NetworkState(Status.FAILED, msg)
    }
}