package pzn.androiddasar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class GameActivity : AppCompatActivity() {

    private lateinit var computerImageView: ImageView
    private lateinit var rockImageButton: ImageButton
    private lateinit var scissorsImageButton: ImageButton
    private lateinit var paperImageButton: ImageButton
    private lateinit var resultImageView: ImageView

    private fun initComponent(){
        computerImageView = findViewById(R.id.computerImageView)
        rockImageButton = findViewById(R.id.rockImageButton)
        scissorsImageButton = findViewById(R.id.scissorsImageButton)
        paperImageButton = findViewById(R.id.paperImageButton)
        resultImageView = findViewById(R.id.resultImageView)
    }

    private fun initListener(){
        rockImageButton.setOnClickListener{startGame("ROCK")}
        scissorsImageButton.setOnClickListener{startGame("SCISSORS")}
        paperImageButton.setOnClickListener{startGame("PAPER")}
    }

    private fun startGame(option : String){
        val computerOPtion = Game.pickRandomOption()
        computerImageView.setImageResource(Game.pickDrawable(computerOPtion))

        when{
            Game.isDraw(option, computerOPtion) -> resultImageView.setImageResource(R.drawable.draw)
            Game.isWin(option, computerOPtion) -> resultImageView.setImageResource(R.drawable.win)
            else -> resultImageView.setImageResource(R.drawable.lose)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        initComponent()
        initListener()
    }
}