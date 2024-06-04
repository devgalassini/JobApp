package galassini.tecnology.jobapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import galassini.tecnology.jobapp.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar o layout usando o método inflate
        binding = ActivityIntroBinding.inflate(layoutInflater)

        // Definir a visualização do conteúdo
        setContentView(binding.root)
    }
}
