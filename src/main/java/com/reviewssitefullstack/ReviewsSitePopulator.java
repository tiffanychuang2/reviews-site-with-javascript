package com.reviewssitefullstack;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewsSitePopulator implements CommandLineRunner {

	@Resource
	private MovieRatingRepository ratingRepo;

	@Resource
	private MovieReviewRepository reviewRepo;

	@Resource
	private GenreRepository genreRepo;

	@Override
	public void run(String... args) throws Exception {
		MovieRating g = new MovieRating("G");
		ratingRepo.save(g);
		MovieRating pg = new MovieRating("PG");
		ratingRepo.save(pg);
		MovieRating pg13 = new MovieRating("PG13");
		ratingRepo.save(pg13);
		MovieRating r = new MovieRating("R");
		ratingRepo.save(r);

		Genre action = new Genre("/images/action.png", "Action");
		genreRepo.save(action);
		Genre comedy = new Genre("/images/comedy.png", "Comedy");
		genreRepo.save(comedy);
		Genre romance = new Genre("/images/romance.png", "Romance");
		genreRepo.save(romance);
		Genre adventure = new Genre("/images/adventure.png", "Adventure");
		genreRepo.save(adventure);
		Genre drama = new Genre("/images/drama.png", "Drama");
		genreRepo.save(drama);
		Genre fantasy = new Genre("/images/fantasy.png", "Fantasy");
		genreRepo.save(fantasy);
		Genre animation = new Genre("/images/animation.png", "Animation");
		genreRepo.save(animation);
		Genre thriller = new Genre("/images/thriller.png", "Thriller");
		genreRepo.save(thriller);
		Genre sciFi = new Genre("/images/sci-fi.png", "Sci-Fi");
		genreRepo.save(sciFi);
		Genre crime = new Genre("/images/crime.png", "Crime");
		genreRepo.save(crime);

		MovieReview review1 = new MovieReview("/images/thebiglebowski.jpg", "The Big Lebowski", "1998",
				"\"The Big Lebowski\" is about an attitude, not a story. It's easy to miss that, because the story is so urgently pursued. It involves kidnapping, ransom money, a porno king, a reclusive millionaire, a runaway girl, the Malibu police, a woman who paints while nude and strapped to an overhead harness, and the last act of the disagreement between Vietnam veterans and Flower Power. It has more scenes about bowling than anything else.",
				r, comedy, crime);
		reviewRepo.save(review1);
		MovieReview review2 = new MovieReview("/images/terminator2.jpg", "Terminator 2: Judgment Day", "1991",
				"In “Terminator 2: Judgment Day,” the future once again comes hunting to kill John Connor. Though the world after the nuclear holocaust of 1997 is ruled by machines, a single man can still make a difference - and that man is Connor, who is a youngster as the movie opens but is destined to grow up into the leader of the human resistance movement against the cyborgs.",
				r, action, sciFi, thriller);
		reviewRepo.save(review2);
		MovieReview review3 = new MovieReview("/images/thematrix.jpg", "The Matrix", "1999",
				"\"The Matrix\" is a visually dazzling cyberadventure, full of kinetic excitement, but it retreats to formula just when it's getting interesting. It's kind of a letdown when a movie begins by redefining the nature of reality, and ends with a shoot-out. We want a leap of the imagination, not one of those obligatory climaxes with automatic weapons fire.",
				r, action, sciFi);
		reviewRepo.save(review3);
		MovieReview review4 = new MovieReview("/images/theproposal.jpg", "The Proposal", "2009",
				"\"The Proposal\" is a movie about a couple who start out hating each other and end up liking each other. It's a funny thing about that. I started out hating the movie and ended up liking it.  It opens on a rather cheerless note, as the portrait of Margaret (Sandra Bullock), a tyrannical book editor, and Andrew (Ryan Reynolds), her long-suffering assistant. ",
				pg13, comedy, drama, romance);
		reviewRepo.save(review4);
		MovieReview review5 = new MovieReview("/images/thorragnarok.jpg", "Thor: Ragnorak", "2017",
				"I wouldn’t have picked Chris Hemsworth as Marvel's breakout comedy star when he was first cast as Thor, God of Thunder, but he turned out to be one of the best things about this never-ending mega-franchise. He’s tall, brawny and impossibly handsome, but there’s a self-mocking twinkle in his eye. When Thor is in gung-ho jock mode, Hemsworth’s wry machismo evokes the young Sean Connery as James Bond, raising an eyebrow at the corniness around him. When he bumbles and stumbles, there’s a touch of Cary Grant to his embarrassment. And when he’s playing things more or less straight, there’s an average guyness to his reactions. All this humanizes an actor who’s perpetually at risk of being treated as a life-sized action figure. ",
				pg13, action, adventure, comedy);
		reviewRepo.save(review5);
		MovieReview review6 = new MovieReview("/images/21jumpstreet.jpg", "21 Jump Street", "2012",
				"Here's the last movie I was expecting with this title. In other words, \"21 Jump Street\" is pretty good. There seemed to be little demand for a movie spinoff of the crime drama that ran on Fox from 1987 to 1991, and which had an early starring role for Johnny Depp. Perhaps realizing that, the filmmakers have abandoned any pretense of being faithful to the series, and turned to a mashup of screwball comedy, action and \"The Odd Couple\" formula.",
				r, action, comedy, crime);
		reviewRepo.save(review6);
		MovieReview review7 = new MovieReview("/images/thebigsick.jpg", "The Big Sick", "2017",
				"It sounds impossible—too melodramatic, too crazy—but it’s true. Actor and writer Kumail Nanjiani fell in love with his then-girlfriend, now-wife, Emily V. Gordon, when she was in a coma. It also sounds impossible that such a story would make for a crowd-pleasing comedy, but that’s exactly what “The Big Sick” is, and so much more.",
				r, comedy, drama, romance);
		reviewRepo.save(review7);
		MovieReview review8 = new MovieReview("/images/harrypotter7-2.jpg",
				"Harry Potter and the Deathly Hallows: Part 2", "2011",
				"After seven earlier films reaching back a decade, the Harry Potter saga comes to a solid and satisfying conclusion in \"Harry Potter and the Deathly Hallows: Part 2.\" The finale conjures up enough awe and solemnity to serve as an appropriate finale and a dramatic contrast to the lighthearted (relative) innocence of \"Harry Potter and the Sorcerer's Stone\" all those magical years ago.",
				pg13, adventure, drama, fantasy);
		reviewRepo.save(review8);
		MovieReview review9 = new MovieReview("/images/frozen.jpg", "Frozen", "2013",
				"\"Frozen,\" the latest Disney musical extravaganza, preaches the importance of embracing your true nature but seems to be at odds with itself.  The animated, 3-D adventure wants to enliven and subvert the conventions of typical Disney princess movies while simultaneously remaining true to their aesthetic trappings for maximum merchandising potential. It encourages young women to support and stay loyal to each other—a crucial message when mean girls seem so prevalent—as long as some hunky potential suitors and adorable, wise-cracking creatures also are around to complete them.",
				pg, animation, adventure, comedy);
		reviewRepo.save(review9);
		MovieReview review10 = new MovieReview("/images/wonderwoman.jpg", "Wonder Woman", "2017",
				"Ever since William Moulton Marston created her in 1941, Wonder Woman has always been at her best when her stories lean into the feminist ethos at her core. When artists treat her compassion as the key to understanding her—rather than her brutality in battle—audiences are privy to a superhero who offers what no other can: a power fantasy that privileges the interiority and desires of women. But film rarely has made room for the fantasies of women on such a grand scale. And in comic adaptations, women can be tough, funny, and self-assured. But rarely are they the architects of their own destiny.",
				pg13, action, adventure, fantasy);
		reviewRepo.save(review10);
		MovieReview review11 = new MovieReview("/images/moana.jpg", "Moana", "2016", "\r\n"
				+ "“Moana” would have been enormously entertaining regardless of when it came out, but its arrival at this particular moment in history gives it an added sense of significance—as well as inspiration.  The latest musical extravaganza from Walt Disney Animation Studios follows the adventures of a young woman who finds her own voice and forges her own identity. She chooses to be a forward-thinking leader of her people on her own terms, rather than a stereotypical princess in need of rescue, which the film acknowledges in amusingly knowing fashion. She has both the wisdom to respect her people’s traditions and the bravery to blaze her own trail toward the future.",
				pg, animation, adventure, comedy);
		reviewRepo.save(review11);
		MovieReview review12 = new MovieReview("/images/lionking.jpg", "The Lion King", "1994",
				"My generation grew up mourning the death of Bambi's mother. Now comes \"The Lion King,\" with the death of Mufasa, the father of the lion cub who will someday be king. The Disney animators know that cute little cartoon characters are not sufficient to manufacture dreams. There have to be dark corners, frightening moments, and ancient archetypes like the crime of regicide. \"The Lion King,\" which is a superbly drawn animated feature, is surprisingly solemn in its subject matter, and may even be too intense for very young children.",
				g, animation, adventure, drama);
		reviewRepo.save(review12);
		MovieReview review13 = new MovieReview("/images/aladdin.jpg", "Aladdin", "1992",
				"Robin Williams and animation were born for one another, and in \"Aladdin\" they finally meet. Williams' speed of comic invention has always been too fast for flesh and blood; the way he flashes in and out of characters can be dizzying. In Disney's new animated film \"Aladdin,\" he's liberated at last, playing a genie who has complete freedom over his form - who can instantly be anybody or anything.",
				g, animation, adventure, comedy);
		reviewRepo.save(review13);
		MovieReview review14 = new MovieReview("/images/interstellar.jpg", "Interstellar", "2014",
				"Christopher Nolan’s \"Interstellar,\" about astronauts traveling to the other end of the galaxy to find a new home to replace humanity’s despoiled home-world, is frantically busy and earsplittingly loud. It uses booming music to jack up the excitement level of scenes that might not otherwise excite. It features characters shoveling exposition at each other for almost three hours, and a few of those characters have no character to speak of: they’re mouthpieces for techno-babble and philosophical debate. And for all of the director’s activism on behalf of shooting on film, the tactile beauty of the movie’s 35mm and 65mm textures isn’t matched by a sense of composition. The camera rarely tells the story in Nolan’s movies. More often it illustrates the screenplay, and there are points in this one where I felt as if I was watching the most expensive NBC pilot ever made.",
				pg13, adventure, drama, sciFi);
		reviewRepo.save(review14);
		MovieReview review15 = new MovieReview("/images/americanpsycho.jpg", "American Psycho", "2000", "\r\n"
				+ "It's just as well a woman directed \"American Psycho.\" She's transformed a novel about blood lust into a movie about men's vanity. A male director might have thought Patrick Bateman, the hero of \"American Psycho,\" was a serial killer because of psychological twists, but Mary Harron sees him as a guy who's prey to the usual male drives and compulsions. He just acts out a little more.",
				r, crime, drama);
		reviewRepo.save(review15);
		MovieReview review16 = new MovieReview("/images/starwarsforceawakens.jpg", "Star Wars: The Force Awakens",
				"2015",
				"“Star Wars: Episode VII - The Force Awakens” is the film that J.J. Abrams was put on Earth to make, as evidenced by the \"Star Wars\" echoes in his hit series \"Lost,” and the way he kept trying to turn \"Star Trek\" into \"Star Wars.\" These tendencies could seem cutesy or irritating elsewhere, but they make sense in an according-to-Hoyle \"Star Wars\" movie. This new one, set 30 years after the events of \"Return of the Jedi,” is funny, touching, and surprisingly light-footed. It boasts a lot of familiar elements, including Skywalker family mythology and another Death Star-type weapon, as well as self-aware lines about how things work in this series. The film ultimately runs up against the limitations of its own nature: like the James Bond films, the “Star Wars” movies are pretty much obligated to revisit certain elements, to the point where they might feel played out even if they hadn’t been raided by other films, TV shows and books (including Harry Potter). But it’s still an exhilarating ride, filled with archetypal characters with plausible psychologies, melodramatic confrontations fueled by soaring emotions, and performances that can be described as good, period, rather than \"good, for 'Star Wars.'\"",
				pg13, action, adventure, fantasy);
		reviewRepo.save(review16);
	}

}