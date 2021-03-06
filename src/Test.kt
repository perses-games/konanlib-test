
import games.perses.math.Math
import games.perses.rand.Rand
import games.perses.sfml.*
import games.perses.sfml.music.Music
import games.perses.sfml.sprite.Sprite
import games.perses.sfml.text.Font
import games.perses.sfml.text.Text
import games.perses.sfml.texture.Textures
import games.perses.sfml.time.Timer

fun main(args: Array<String>) {

    Music.load("data/music/DST-TechnoBasic.ogg")

    val font = Font("data/fonts/COMPUTERRobot.ttf")
    val helloKonan = Text(font, 50f, 50f, "Hello Konan!", 76, 0.toByte(), 255.toByte(), 255.toByte())
    val fpsDisplay = Text(font, 20f, 10f, "FPS: 0", 76, 0.toByte(), 255.toByte(), 0.toByte())

    Cleanup.add {
        fpsDisplay.destroy()
        helloKonan.destroy()
        font.destroy()
    }

    // Music.play()

    val window = Window("Test", 1024, 768, style = WindowStyle.DEFAULT.value)

    window.setClearColor(10, 50, 100)
    //window.enableVerticalSync()

    if (window.isOpen()) {
        val smiley = Textures.getOrLoad("data/img/smiley.png")

        View.setToWidth(2000)
        Textures.matrix.setOrthographicProjection(-5f, 5f, -5f, 5f, -5f, 5f)

        val sprites = ArrayList<Sprite>()

        for (index in 1..100) {
            val x = Rand.getInt() % 2000 - 1000f
            val y = Rand.getInt() % 2000 - 1000f
            sprites.add(Sprite(smiley, x, y, 0.1f))
        }

        while (Events.running) {
            window.pollEvents()
            window.clear()

            View.updateViewport()
            for (sprite in sprites) {
                sprite.render()
            }
            smiley.render()

            window.resetGLStates()
            window.setView(View.view)

            fpsDisplay.setText("FPS: ${Timer.fps}")
            window.draw(helloKonan, 100f + Math.sin(Timer.time.toDouble()).toFloat() * 50f, 100f + Math.cos(Timer.time.toDouble()).toFloat() * 50f)
            window.draw(fpsDisplay)

            View.updateViewport()
            smiley.queueDraw(-200f, -200f, (0.50f + Math.sin(Timer.time.toDouble()) * 0.25f).toFloat(), Timer.time)

            smiley.render()

            window.display()

            Timer.tick()
        }
        window.close()

    }

    Cleanup.destroy()
}
