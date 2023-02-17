package com.bootcamp.tugas3_bootcampidn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global
import com.bootcamp.tugas3_bootcampidn.databinding.ActivityDetailNewsBinding
import com.bumptech.glide.Glide

class DetailNewsActivity : AppCompatActivity() {
private lateinit var binding : ActivityDetailNewsBinding
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityDetailNewsBinding.inflate(layoutInflater)
		setContentView(binding.root)
		val news = intent.getParcelableExtra<ArticlesItem>(detail)


		Glide.with(binding.imgNews)
			.load(news?.urlToImage)
			.error(R.drawable.ic_launcher_background)
			.into(binding.imgNews)
		binding.tvJudul.text = news?.title
		binding.tvDeskripsi.text = news?.description

	}
	companion object {
		const val detail = "news"

	}

}