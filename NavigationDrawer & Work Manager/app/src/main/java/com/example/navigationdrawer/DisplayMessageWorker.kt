import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class DisplayMessageWorker(appContext: Context, workerParams: WorkerParameters) : Worker(appContext, workerParams) {
    override fun doWork(): Result {
        // Menampilkan pesan setelah pekerjaan selesai dijalankan
        displayNotification("Pesan yang ingin ditampilkan")
        return Result.success()
    }

    private fun displayNotification(message: String) {
        // Di sini kamu bisa menggunakan notifikasi atau print ke log, atau tindakan lainnya
        // Contoh: Print pesan ke log
        println(message)
    }
}
