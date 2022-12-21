package uz.gita.bookapi.utils

sealed interface ResultData<T> {
    class Success<T>(val data: T?) : ResultData<T>
    class Failure<T>(val message: String) : ResultData<T>
    class Loading<T>(val state: LoadingType) : ResultData<T>
    class HasConnection<T>(val state: Boolean) : ResultData<T>


}
data class LoadingType(
    val fullScreen: Boolean = false,
    val bookItem:Boolean = false,
    val userItem:Boolean = false
)