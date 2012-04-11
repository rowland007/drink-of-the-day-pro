package com.randarlabs.database;

import com.randarlabs.database.sqlite.DBAdapter;

public class Drinks {
	public static void setSundayDrinks(DBAdapter db){
		db.open();
		id = db.insertRecipe(
        		"Rum & Coke",
        		"5 oz.  Cola\n2 oz.  Light Rum", 
        		"Fill a Highball glass almost full with ice cubes. Pour Rum and Coke into the Highball glass. " +
        		"Stir well, garnish with a Lemon Wedge, and serve.");        
        id = db.insertRecipe(
        		"Shirley Temple (non-alcoholic)",
        		"3 oz lemon-lime soda\n3 oz ginger ale\n1 dash grenadine\nmaraschino cherry for garnish",
        		"Pour the lemon-lime soda and ginger ale into a collins glass with ice cubes. " +
        		"Add a dash of grenadine. Stir. Garnish with the cherry.");
        id = db.insertRecipe(
        		"Frozen Virgin Margarita",
        		"12oz Limeade Concentrate or Margarita Mix\n2Cups Ice\n12oz Non-Alcoholic Beer\n2oz Lime Juice",
        		"In a blender or food processor, whirl limeade concentrate and ice until ice is very finely " +
        		"crushed. Add beer (if space in blender is limited, add only part of the beer). Pour into " +
        		"salt-rimmed glasses (add any remaining beer equally to each) and garnish with lime wedges. Serves 6.");
        db.close();
	}
	public static void setMondayDrinks(DBAdapter db){
		db.open();
		id = db.insertRecipe(
        		"Albuquerque Style Margarita",
        		"1 Lime\n6oz Can Frozen Lime Juice or Margarita Mix\n3/4Cup Tequila\n6Tbsp Triple Sec\n" +
        		"1 Can Lemon-Lime or Grapefruit Soda\n4Cups Ice Cubes\nLime Twist for Garnish\nLime Peel for Garnish",
        		"Rub rim of each cocktail glass with lime wedge; swirl glass in salt to coat rim. Combine half of " +
        		"each of the remaining ingredients, except garnishes, in blender container; blend until ice is finely " +
        		"chopped and mixture is slushy. Pour into salt-rimmed glasses. Repeat with remaining ingredients. Garnish, if desired.");
		id = db.insertRecipe(
				"Apricot Margarita",
				"1 1/2Cup Fresh Apricots or 16oz Can Juice-Packed, Unpeeled, Halved\n1/2Cup Tequila\n1/4Cup Sugar\n1/4Cup Fresh " +
				"Lime Juice or Margarita Mix\n1/2Cup Apricot Nectar\n3Cups Ice Cubes",
				"Combine apricot halves, tequila, sugar, lime juice and apricot nectar in a blender; cover and blend until " +
				"smooth. With blender running, add ice cubes, blending until slushy. Makes 4 Margaritas.");
		id = db.insertRecipe(
				"Avocado Margarita",
				"6oz Blanco Tequila\n2oz Triple Sec\n6oz Limeade Concentrate or Margarita Mix\n2Cups Ice\n1 Chopped Avocado\n6oz Water",
				"Blend all ingredients in blender until smooth.");
		id = db.insertRecipe(
				"Banana Margarita",
				"6oz Blanco or Silver Tequila\n6oz Limeade Concentrate or Margarita Mix\n4oz Triple Sec\n6Cups Ice\n2 Bananas\n1/4Cup" +
				" Coarse Granulated Sugar",
				"Sugar the rims of your margarita glasses. In a blender, combine all ingredients and blend until smooth. Pour into glasses and serve.");
		id = db.insertRecipe(
				"Bangin' Margarita", 
				"1oz Triple Sec\n1/3Cup Tequila\n1/2oz Lime Juice",
				"Rim a hurricane glass lip with salt (moisten with some lime juice). " +
				"Add the tequila, triple sec and lime juice, fill the rest of the glass with ice cubes. Serve.");
		id = db.insertRecipe(
				"Bartender's Margarita", 
				"1 1/2oz Tequila\n1 Dash Cranberry Juice\n1oz Triple Sec\n3oz Sweet and Sour Mix\nJuice from 1/2 Lime\nFloat Orange Liqueur",
				"Shake tequila, triple sec, sweet and sour, cranberry juice, and lime juice in a glass. " +
				"Rim another glass with salt and transfer contents. Float the orange liqueur, garnish with a lime and straw and serve.");
		id = db.insertRecipe(
				"Beer Margarita",
				"6oz White or Blanco Tequila\n12oz Beer\n6oz Limeade Concentrate or Margarita Mix\nLime Flavored Salt\nIce Cubes",
				"Cover the rim of the glass with the salt.  Pour all ingredients into blender and blend well.");
		id = db.insertRecipe(
				"Big Apple Margarita", 
				"2oz Tequila\n1oz Apple Liqueur\n1oz Fresh Lemon Juice",
				"Shake with ice and strain into a chilled glass with a salted rim. Garnish with a slice of green apple and serve.");
		id = db.insertRecipe(
				"Blackberry Lime Margarita",
				"2Cups Blackberries\n1/2Cup Lime Juice or Margarita Mix\n3/4Cups White Tequila\n1/4Cups Sugar\n2Cups Ice Cubes",
				"Puree blackberries in a blender. Force puree through a fine sieve into a small bowl and discard solids.  " +
				"In a cocktail shaker, combine 1/2 cup puree and remaining ingredients and shake well");
		id = db.insertRecipe(
				"Blackjack Margarita",
				"1 1/2oz Tequila\n1/2oz Triple Sec\n1/2oz Raspberry Liqueur\n4oz Lime Juice",
				"Fill glass with ice. Add tequila, triple sec, raspberry liqueur and lime juice or sour mix. Shake, garnish with a lime wedge and serve.");
		id = db.insertRecipe(
				"Bloody Margarita",
				"1 1/2oz Tequila\n1oz Blood Orange Juice\n1/2oz Lime Juice\nOrange Liqueur",
				"Shake with ice, strain into a chilled glass and serve.");
		id = db.insertRecipe(
				"Blue Margarita",
				"1 1/2oz Blanco Tequila\n1/2oz Blue Curacao\n1tsp Orange Liqueur\n1oz Lime juice or Margarita Mix",
				"Add ingredients, plus ice, to cocktail shaker and shake well. Strain into salted glass. Garnish with lime wedge.");
		id = db.insertRecipe(
				"Blue Lagoon Margarita",
				"1oz Tequila\n1oz Blue Curacao\n1oz Pineapple Juice\nSplash of Lime Juice or Margarita Mix",
				"Mix ingredients in shaker with ice.  Strain into margarita glass filled with ice, " +
				"garnished with lime.  Squeeze some lime juice over the top and serve");
		id = db.insertRecipe(
				"Blueberry Margarita",
				"1/3Cup Tequila\n2Tbsp Triple Sec\n1Tbsp Lime Juice or Margarita Mix\n2/3Cup Blueberries\n2/3Cup Raspberry Sorbet\n14 Ice Cubes",
				"Add all ingredients into blender and blend well.");
		id = db.insertRecipe(
				"Brandy Margarita",
				"9oz Blanco Tequila\n3oz Brady\n6oz Limeade Concentrate\n6oz Water\n3 1/2oz Orange Liqueur",
				"Put in blender with ice to make frozen drink.  Makes one pitcher.");
		id = db.insertRecipe(
				"Cabo Waborita",
				"1oz Fresh Lime Juice or Margarita Mix\n1oz Triple Sec\n2oz Sammy Hagar's Cabo Wabo Tequila",
				"Mix in a shaker over ice. Serve in salt-rimmed glass.");
		id = db.insertRecipe(
				"Cadillac Margarita",
				"2oz Reposado Tequila\n1/2oz Orange Liqueur\n2oz Lime Juice or Margarita Mix",
				"All ingredients poured over ice into a tall mixing glass, shaken briskly, " +
				"strained into chilled cocktail glass with salted rim (optional). Garnish with lime wheel..");
		id = db.insertRecipe(
				"Carrot Margarita",
				"3oz Blanco or Reposado Tequila\n3oz Carrot Juice\n1oz Margarita Mix\n1 1/2oz Orange Liqueur\nIce Cubes",
				"Combine all ingredients and serve on the rocks.");
		id = db.insertRecipe(
				"Chambord Raspberry Margarita",
				"4Cups Frozen Raspberries\n2Tbspn Lemon Juice or Margarita Mix\n6oz Tequila\n2oz Gran Marnier\n3oz Chambord",
				"In a blender, combine frozen raspberries, lemon juice, tequila, Gran Marnier, Chambord and ice. Blend until " +
				"smooth. Pour sugar onto a small plate. Wet the rim of margarita glasses. Dip the rim in the sugar. Pour the " +
				"raspberry margaritas into the prepared glasses.");
		id = db.insertRecipe(
				"Cherry Margarita",
				"1/2Cup Cherries (Pitted and Mashed) or 2oz Fresh Cherry Puree\n1oz Simple Syrup\n1oz Lime Juice\n3/4oz Cointreau\n" +
				"1 1/2oz Tequila\nLime Wedge for Garnish",
				"In a cocktail shaker mash the cherries with the simple syrup and lime juice. Add the other ingredients and shake " +
				"to combine. If using the puree shake to combine.");
		id = db.insertRecipe(
				"Chocolate Margarita",
				"1 1/2oz Tequila\n1oz Godiva Liquor\n2Tbsp Chocolate Syrup\n3/4oz Cream or Half and Half\n2oz Orange Juice\n1/2oz Lime Juice " +
				"or Margarita Mix\nStirrings Cocoa Rimmer\nIce",
				"Rim the glass with the cocoa rimmer. Combine all ingredients in a shaker full of ice and pour into a glass.");
		id = db.insertRecipe(
				"Citrus Margarita",
				"2Cups Tequila\n1Cup Orange Liqueur (Cointreau)\n1/4Cup Grapefruit Juice\n1/4Cup Orange Juice\n1/4Cup Lime Juice or " +
				"Margarita Mix\nIce\nLime, Orange, and Grapefruit Slices",
				"Mix orange, lime and grapefruit juice along with the tequila and orange liqueur. Chill drink. Put everything into " +
				"a shaker, then shake and strain into a salt-rimmed glass with ice.  Garnish using a lime, orange and grapefruit slice");
		id = db.insertRecipe(
				"Coconut Margarita",
				"1 1/2oz Blanco Tequila\n1/2oz Orange Liqueur\n1tsp Cream of Coconut\n2oz Pineapple Juice\n2oz Sweet and Sour Mix\n" +
				"1tsp Shaved Coconut\n1Cup Ice",
				"Place ice in a blender and blend for 10 seconds. To add thickness, add more ice and blend. Dip wet rim of a " +
				"margarita glass in the coconut shavings and pour into glass. Makes 1 margarita.");
		id = db.insertRecipe(
				"Cool Mint Margarita",
				"1 1/2oz Cuervo Gold Tequila\n1/2oz Cointreau\n1/2oz Dekuyper Creme de Menthe\n3oz Margarita Mix",
				"Shake ingredients with ice. Pour into a salted cocktail glass. Garnish with fresh mint or lime.");
		id = db.insertRecipe(
				"Cranberry Margarita",
				"1 1/2oz Tequila\n3/4oz Triple Sec\n3/4oz Margarita Mix\n2 1/2oz Cranberry Juice\n6 Ice Cubes",
				"Put all ingredients into shaker, shake and serve.");
		id = db.insertRecipe(
				"Creamsicle Margarita",
				"1 1/2oz Gold Tequila\n1oz Margarita Mix\n3oz Orange Juice\n1 Scoop Vanilla Ice Cream\n6oz Ice",
				"Blend all ingredients until slushy.");
		id = db.insertRecipe(
				"Frozen Cactus Pear Margarita",
				"9oz White Tequila\n4oz Orange Liqueur\n4oz Cactus Pear Juice\n2oz Lime Juice or Margarita Mix\n1 1/2Cups Crushed Ice",
				"Place tequila, orange liqueur, cactus pear juice, lime juice, and ice in a blender and blend until smooth. Pour a " +
				"few ounces of cactus pear juice onto a plate and a few ounces of salt onto another plate. Dip the rim of each " +
				"margarita glass into the juice and then into the salt. Pour margaritas into each glass and garnish with a lime wedge.");
		id = db.insertRecipe(
				"Frozen Honeydew Margarita", 
				"1 Honeydew Melon\n3/4Cup White Tequila\n1/3Cup Lime Juice or Margarita Mix\n2 1/2Tbsp Sugar",
				"Remove and discard rind and seeds from melon and cut enough fruit into 1/2-inch cubes to measure 3 1/2 cups. Freeze " +
				"melon cubes in a sealable plastic bag at least 3 hours and up to a week. Puree frozen honeydew in a blender with " +
				"remaining ingredients until smooth. Pour drink into stemmed glasses. This recipe for Frozen " +
				"Honeydew Margaritas serves/makes 4.");
		id = db.insertRecipe(
				"Frozen Margarita", 
				"12oz Limeade Concentrate or Margarita Mix\n1 1/2Cups Tequila\n1/2Cup Triple Sec\nIce Cubes\nLime Wedges",
				"Combine half of each of the first 4 ingredients in container of an electric blender. Process 30 seconds. Gradually " +
				"add enough ice cubes to bring mixture to 3 1/2 cup level; blend until smooth. If you want to freeze for later " +
				"use, pour mixture into a large freezer container. Repeat procedure with remaining half of ingredients. Cover " +
				"tightly and freeze up to 1 month. To serve, If frozen, thaw 20 minutes or until mixture becomes slushy. " +
				"Rub rims of cocktail glasses with lime wedge. Place salt in saucer; spin rim of each glass in salt. Pour " +
				"beverage into prepared glasses. Garnish, if desired. Serve immediately. Yields about 7 cups.");
		id = db.insertRecipe(
				"Ginger Peach Margarita",
				"8oz Tequila\n4oz Cointreau\n6oz Peach or Nectar Juice\n2oz Lime Juice or Margarita Mix\n4oz Ginger Syrup\n12oz peach " +
				"puree\n4 Lime Wedges\nColored Sugars, Lime, Candied Ginger and Peach Wedges",
				"Place pureed peaches, ginger syrup, lime juice and peach juice or nectar in a blender and mix together. " +
				"Pour the mixture into a bowl and place in the freezer. When ready to serve, add the alcohol. " +
				"Combine well, pour into glasses, garnish and serve. You can also place the mixture into an ice cream " +
				"maker and make a lot for a party. With this method, the mixture stays frozen longer and has a better consistency. " +
				"This recipe serves/makes 8.");
		id = db.insertRecipe(
				"Grapefruit Margarita",
				"6oz Tequila\n2oz Triple Sec\n3/4Cup Grapefruit Juice\n1/2oz Lime Juice or Margarita Mix\n2oz Ice\nGrapefruit Wedges",
				"Combine all ingredients into a blender. Blend until smooth consistency.  Place grapefruit wedge on rim of the glass. " +
				"Makes 6 - 8 servings.");
		id = db.insertRecipe(
				"Hpnotiq Margarita",
				"1 1/2oz Reposado Tequila\n3oz Triple Sec\n3oz Hpnotiq Liqueur\n1 1/2oz Lime Juice or Margarita Mix",
				"Mix the Hpnotiq, triple sec, gold tequila and lime juice into a glass filled with ice. " +
				"Fill the rest with sweet and sour mix, and serve.");
		id = db.insertRecipe(
				"Italian Margarita",
				"6oz Tequila\n2oz Amaretto\n1oz Triple Sec\n6oz Lemonade Concentrate or Margarita Mix\n3oz Water\n3Cups Ice Cubes",
				"Put all ingredients in a blender and blend until slushy.");
		id = db.insertRecipe(
				"Jalapeño Margarita", 
				"4oz Blanco Tequila\n4oz Orange Liqueur\n1 1/2oz Lime Juice or Margarita Mix\n1/2 Fresh Jalapeño",
				"Muddle jalapeno and then combine lime juice (or margarita mix), tequila and orange liqueur.  Shake and strain over ice.");
		id = db.insertRecipe(
				"Jalapeño Cilantro Margarita",
				"1 1/2oz Blanco Tequila\n3/4oz Lime Juice\n1/4oz Agave Nectar\n1/4oz Oranage Liqueur\n8 Cilantro Leaves\n3 Small Jalapeño Pepers",
				"Muddle cilantro and jalapeño pieces, add tequila and orange liqueur.  Shake and strain over ice.   Garnish with cilantro and pepper.");
		id = db.insertRecipe(
				"Jimmy Buffett's Perfect Margarita",
				"1/2oz Blanco Tequila\n1 1/4oz Lime Juice or Margarita Mix\n2oz Gold Tequila\n3 Lime Wedges\n1 Splash Orange Curaçao",
				"Put all ingredients except the 3 lime wedges into a shaker. Squeeze 2 of the lime wedges into the shaker. " +
				"SHAKE WELL! Rim outside of glass only with lime. Salt only the outside of the glass. " +
				"Add fresh crushed ice to glass. Strain mixture over ice. Squeeze remaining lime wedge in glass.");
		id = db.insertRecipe(
				"Jule's Limeade-Beer Margarita",
				"1/2Can Concentrated Limeade Juice\n1/2Can Beer\n1/2Can Tequila\nIce",
				"This recipe calls for the 1/2 can of Limeade Concentrate to be added to the blender first. " +
				"This is because you will empty the other half can of juice to a bowl and refrigerate in order to be " +
				"able to use the can as a measuring tool for the evening or event. Using the can add the ingredients. " +
				"In blender blend first 3 ingredients with ice, coat the edge of each glass with lime wedge and salt. " +
				"Poor blend into glass and serve. The beer and limeade are amazing together. Its a surprise result.");
		id = db.insertRecipe(
				"Key West Margarita",
				"1 1/2oz Tequila\n1oz Piña Colada Mix\n1oz Melon Liqueur\n1/2oz Lime Juice or Margarita Mix\n1/2oz Orange Juice\n1/2Cup Ice\n Grenadine",
				"Mix all in blender with a splash of grenadine. Blend at slow speed until smooth and pour into a glass.");
		id = db.insertRecipe(
				"Kiwi Margarita",
				"1/2Cup Gold Tequila\n1/2Cup Silver Tequila\n1/2Cup Triple Sec\n1/2Cup Lime Juice or Margarita Mix\n1Cup Lemon Juice\n1/2Cup Sugar\n2 Peeled Kiwifruit",
				"Put all ingredients into blender with ice and blend.  Serve with lime wedge on glass.");
		id = db.insertRecipe(
				"Low-Calorie Margarita",
				"8oz Tequila\n6oz Grand Marnier\n4oz Presidente Mexican Brandy\n2Cups Water\n1Tube Crystal Light Lemon-Lime Drink Mix\nJuice from One Lime",
				"Put all ingredients into blender and blend. Garnish with a wedge of lime.");
		id = db.insertRecipe(
				"Limeade Margarita",
				"4oz Tequila\n2oz Orange Liqueur\n6oz Water\n6oz Frozen Limeade Concentrate",
				"Serve on the rocks or frozen by adding 2 cups of ice instead of water to blender.");
		id = db.insertRecipe(
				"Mango Margarita",
				"4oz Tequila\n1oz Triple Sec\n1/2oz Margarita Mix\n2oz Water\n2Cups Crushed Ice\n2 Peeled Mangos",
				"Add all ingredients to blender and blend until smooth. Makes 2 servings.");
		id = db.insertRecipe(
				"Margarita Sunrise",
				"1Cup Tequila\n6oz Orange Juice Concentrate\n1/4Cup Powdered Sugar\n3Cups Cracked Ice\n1 Lime, Cut in Half\nGranulated Sugar",
				"Rub rims of 4 stemmed glasses with lime half, then dip rims of glasses into granulated sugar to coat rims. " +
				"Squeeze juice from both lime halves into blender container and add remaining ingredients to blender. " +
				"Cover; blend on high speed until foamy. Pour into prepared glasses. This Margarita Sunrise recipe makes 4 servings.");
		id = db.insertRecipe(
				"Margarita Texas Rita",
				"4oz Margarita Texas Mix\n3oz Paula's Texas Orange Liqueur\n2oz Blanco Tequila", 
				"Serve on the rocks.");
		id = db.insertRecipe(
				"Margaritini",
				"2oz Silver Tequila\n1oz Cointreau\nFresh Lime Juice\n1Splash Margarita Mix",
				"Shake all ingredients with ice and strain into a Martini glass.");
		id = db.insertRecipe(
				"Midori Margarita",
				"1 1/2oz Blanco Tequila\n1oz Midori\n1oz Sweet and Sour Mix",
				"Mix ingredients in ratio above. Blend with crushed ice and pour into salted glass.");
		id = db.insertRecipe(
				"Paula's Awesome Margarita",
				"4oz Paula's Texas Orange Liqueur\n4oz Premium Tequila\n2oz Lime Juice or Margarita Mix\n2oz Water",
				"Mix ingredients. To serve martini-style, shake with ice and strain into chilled margarita glass. " +
				"For a more refreshing version, serve over lots of ice.");
		id = db.insertRecipe(
				"Peach Margarita",
				"1 1/2oz Tequila\n1oz Peach Schnapps\n1tsp Triple Sec\n1oz Lime Juice or Margarita Mix\n1 Lime Wedge",
				"Shake with ice and strain into salt-rimmed glass. Serve with a lime wedge.");
		id = db.insertRecipe(
				"Pineapple Tangerine Margarita",
				"4oz Blanco Tequila\n6 Tangerines, Tangelos, or Mandarin Oranges\n2Cups Pineapple Cubes\n2Tbsp Rice Syrup or Other Sweetner" +
				"1tsp Lime Juice or Margarita Mix\n1/8tsp Mild Chili Powder\n2Cups Ice Cubes\n1Pinch Salt", 
				"uice tangerines. You should have about 1 3/4 cups juice. Place in blender with pineapple, " +
				"sweetener, lime juice, ice, chili powder, and salt. Blend on highest speed till smooth, " +
				"about 30 seconds. Serve margaritas in goblets garnished with pineapple wedges dipped in chili powder.");
		id = db.insertRecipe(
				"Pink and Fruity Margarita",
				"5oz Tequila\n3oz Triple Sec\n2oz Grand Marnier\n1Cup Cranberry Juice\n1Cup Sweet and Sour Mix\nLime Slices\nMaraschino Cherries",
				"Fill four salt rimmed glasses with ice. Mix the sweet and sour mix, cranberry juice, tequila, Triple Sec, and " +
				"Grand Marnier in a pitcher or cocktail shaker. Carefully pour the mixture into the glasses. " +
				"Garnish with the lime slices and cherries. Makes 4 Servings.");
		id = db.insertRecipe(
				"Pomegranate Margarita",
				"2Cups Silver Tequila\n1Cup Pomegranate Liqueur\n1Cup Cointreau\n1Cup Cranberry Juice\n1Cup Lime Juice or Margarita Mix",
				"In a pitcher mix the ingredients. Shake well and poor over ice.");
		id = db.insertRecipe(
				"Prickly Pear Margarita",
				"1 1/2oz Premium Tequila\n1/2oz Grand Marnier\n1 1/2oz Prickly Pear Juice\n3/4oz Lime Juice or Margarita Mix\n2 1/2oz Lemonade",
				"Mix ingredients over ice.");
		id = db.insertRecipe(
				"Pumpkin Margarita",
				"2oz Reposado Tequila\n1oz Margarita Mix\n1Tbsp Pumpkin Puree",
				"Rub rim of glass with lime juice and apply cinnamon to rim. Put all ingredients into shaker, " +
				"shake and serve. Garnish with a lime wedge.");
		id = db.insertRecipe(
				"Raspberry Margarita",
				"3/4Cup Blanco Tequila\n2/3Cup Margarita Mix\n1oz Orange Liqueur\n30 Raspberries\n2Cups Ice",
				"Strain seeds from berries. Put ingredients in a blender with the ice and blend until smooth and slushy.");
		id = db.insertRecipe(
				"Red Berry Margarita",
				"3oz Tequila\n1oz Triple Sec\n1/2Cup Raspberries\n1Cup Strawberries\n2oz Margarita Mix\n2Cups Ice",
				"Strain seeds from berries. Line the rim of the glass with salt. In a blender, combine the tequila, " +
				"triple sec, berries, and ice. Blend until smooth. Pour margarita into glasses and serve.");
		id = db.insertRecipe(
				"Sangria Margarita",
				"8oz Tequila\n12oz Margarita Mix\n2oz Lime Juice\n3oz Triple Sec\n4oz Sangria",
				"Pour the tequila, margarita mix, lime juice and triple sec into a blender " +
				"with ice and blend. Pour the mixture into the glass until 2/3 full, add the sangria.");
		id = db.insertRecipe(
				"Strawberry Margarita",
				"1oz Blanco Tequila\n1/2oz Orange Liqueur\n1/2oz Strawberry Schnapps\n1/2oz Lemon or Lime Juice or Margarita Mix\n" +
				"1oz Strawberries\n1/2Cup Ice",
				"Rub rim of glass with a rind of lime and dip in salt or sugar. Pour all ingredients into blender, blend until slushy and serve.");
		id = db.insertRecipe(
				"Superior Margarita",
				"2oz 100% Blue Agave Tequila\n1 1/2oz Sweetened Lime Juice\n3/4oz Cointreau\nFresh Lime Juice\nSplash Sweet and Sour Mix",
				"Fill a glass or cocktail shaker with ice. Add all ingredients except lime juice and salt. " +
				"Shake vigorously. Dip the rim of a margarita glass into lime juice and then into salt. " +
				"Fill the glass with crushed ice. Strain the margarita into the ice-filled glass and serve. " +
				"Alternately, combine ingredients in a blender filled with ice. Blend until thoroughly mixed. " +
				"Pour into a margarita glass and serve.");
		id = db.insertRecipe(
				"Tangerine Margarita", 
				"2oz Blanco Tequila\n1oz Orange Liqueur\n1/2oz Lime Juice or Margarita Mix\n1/2oz Tangerine Juice",
				"Mix all ingredients with ice and strain into a glass and serve.");
		id = db.insertRecipe(
				"Vanilla Margarita",
				"2oz Tequila\n2oz Triple Sec\n2oz Grand Marnier\n1oz Margarita Mix\n1 Large Vanilla Bean", 
				" Use an empty bottle to mix equal parts of ingredients. " +
				"Add the vanilla bean and let sit for approx 2 months.  " +
				"If you let it sit longer, it should improve the taste. " +
				"Serve on the rocks.");
		id = db.insertRecipe(
				"Watermelon Margarita",
				"1 1/2oz Tequila\n3/4oz Triple Sec\n3/4oz Midori\n2oz Sour Mix\n6oz Cubed Seeded Watermelon\n8oz Ice",
				"Blend all ingredients together; serve in a 14-ounce glass. Garnish with lime and watermelon wedge.");
		id = db.insertRecipe(
				"White Cap Margarita", 
				"2oz Blanco Tequila\n3Tbsp Lime Juice or Margarita Mix\n1/4Cup Cream of Coconut\n1Cup Ice",
				"Place all ingredients in a blender and blend until smooth. This makes one drink.");
		db.close();
		
	}
	public static void setTuesdayDrinks(DBAdapter db){
		db.open();
		id = db.insertRecipe(
        		"209 East Cocktail",
        		"1 1/2oz Tequila\n1oz Orange Liqueur\n1/2oz Strawberry Liqueur\n1oz Lime Juice",
        		"Shake all ingredients with ice, strain into chilled glass and serve.");
		id = db.insertRecipe(
				"4 Godfathers",
				"1oz Tennessee Whiskey\n1oz Scotch Whisky\n1oz Bourbon Whiskey\n1oz Tequila",
				"Pour the whiskeys and tequila into a glass, stir gently, and serve. " +
				"Alternatively, pour the whiskeys and tequila over 2 ice cubes, stir and serve.");
		id = db.insertRecipe(
				"A-Bomb",
				"1/2oz Tequila\n1/2oz Vodka\n2oz Root Beer\n1/2oz Root Beer Schnapps\n1/2Scoop Ice Cream",
				"Add root beer to ice cream. In a another glass mix the rest of the ingredients and pour over the ice cream.");
		id = db.insertRecipe(
				"Acapulco Clam Digger",
				"1 1/2oz Tequila\n3oz Tomato Juice\n3oz Clam Juice\n4/5Tbsp Horseradish\n1Dash Lemon Juice\nWorcestershire Sauce\nRed Pepper Sauce", 
				"Mix over cracked ice in glass. Garnish with a slice of lemon.");
		id = db.insertRecipe(
				"Acapulco Dream Cream",
				"1oz Gold Tequila\n1/2oz Coconut Cream\n2oz Orange Juice\n1Tbsp Cinnamon",
				"Combine all ingredients in a shaker half-filled with ice cubes. " +
				"Shake well, and pour into glass. Dust with cinnamon and serve");
		id = db.insertRecipe(
				"Acapulco Zombie",
				"1 1/2oz Vodka\n1 1/2oz Tequila\n1 1/2oz Rum\n1Dash White Creme de Menthe\nOrange Juice\nGrapefruit Juice",
				"Pour the alcohol in first, then finish off the glass with the two juices.");
		id = db.insertRecipe(
				"Acapulcoco",
				"1oz Gold Tequila\n1oz Coffee Liqueur\n4/5oz Dark Rum\n1/2oz Coconut Cream",
				"Shake and strain into glass, and garnish with a cherry and orange slice.");
		id = db.insertRecipe(
				"Acid Trip",
				"1 1/2oz Melon Liqueur\n1/2oz Gin\n1/2oz Vodka\n1/2ozRum\n1/2ozTequila",
				"Shake with ice and strain into glass.");
		id = db.insertRecipe(
				"Adios Motherfucker",
				"1/2 oz Vodka\n1/2oz Rum\n1/2ozTequila\n1/2oz Gin\n1/2oz Blue Curacao Liqueur\n2oz Sweet and Sour Mix\n2oz Lemon-Lime Soda",
				"Pour all ingredients except the lemon lime soda into a chilled glass filled with ice cubes. " +
				"Top with lemon lime soda and stir gently.");
		id = db.insertRecipe(
				"Adios Motherfucker #3",
				"1oz Gin\n1oz Light Rum\n1oz Tequila\n1oz Vodka\n1 1/2oz Blue Curacao Liqueur\n2oz Sweet and Sour Mix\n1oz Lemon-Lime Soda",
				"Shake alcohol, then add lemon lime soda on top. Serve on the rocks.");
		id = db.insertRecipe(
				"Agave Kiss",
				"2oz Herradura Tequila Silver\n1oz White Creme de Cacao\n1oz Double Cream\n1/2oz Chambord\n1 White Chocolate Flake\n4 Raspberries",
				"1.In a cocktail shaker with ice, add Herradura tequila, white crème de cacao, double cream and Chambord. 2.Shake for 15 seconds. " +
				"3.Pour into a chilled cocktail glass, rimmed with white chocolate, add a spear of fresh raspberries, and serve.");
		id = db.insertRecipe(
				"Alamo Splash",
				"1 1/2oz Tequila\n1oz Orange Juice\n1/2oz Pineapple Juice\n1 Dash Lemon-Lime Soda",
				"Mix with cracked ice and strain nad serve.");
		id = db.insertRecipe(
				"Alleluia",
				"1 1/2oz Tequila\n1tsp Blue Curacao Liqueur\n1tsp Cherry Liqueur\n1/2oz Lemon Juice\n1/2tsp Sugar\n4oz Tonic Water",
				"Combine the tequila, blue curacao, cherry liqueur, lemon juice and sugar in a cocktail shaker half-filled " +
				"with ice cubes. Shake well and strain into a glass almost filled with ice cubes. Top with tonic water, " +
				"garnish with a Cherry and an orange slice and serve.");
		id = db.insertRecipe(
				"Almond Casa Noble",
				"1/2oz Tequila\n1oz Almond Liqueur\n1oz Orange Juice\n1 Lime Wedge",
				"Shake ingredients in mixing glass with ice, except almond liqueur, then strain into glass. Add almond liqueur. " +
				"Drop lime in glass.");
		id = db.insertRecipe(
				"Amaretto Stone Sour #3",
				"2oz Sweet and Sour Mix\n2oz Almond Liqueur\n2oz Tequila\nDash Orange Juice",
				"In a shaker with ice, add sour mix, tequila, and amaretto. Shake well. " +
				"Strain into glass. Add a splash of orange juice. Garnish with an orange slice and a cherry and serve.");
		id = db.insertRecipe(
				"Ambassador", 
				"2oz Tequila\n1tsp Sugar Syrup\nOrange Juice\nOrange Slice",
				"Stir and serve over ice. Garnish with the slice of orange.");
		id = db.insertRecipe(
				"Amber's Revenge", 
				"4oz Scotch Whiskey\n2oz Rum\n2oz Tequila\nRoot Beer", 
				"Mix scotch, rum and tequila over ice, then fill with root beer.");
		id = db.insertRecipe(
				"Ambijaxtrious",
				"3oz Vodka\n3oz Tequila\n3oz Coffee Liqueur\n2oz Milk\n2 Dash Grenadine Syrup", 
				"Pour mixture into glass filled with crushed ice and stir briskly.");
		id = db.insertRecipe(
				"Apple Grande",
				"1 1/2oz Tequila\n4/5Cup Apple Cider",
				"Chill both ingredients! Mix in a tumbler and serve.");
		id = db.insertRecipe(
				"ApriJose Nectar", 
				"1 1/2oz Tequila\n3oz Apricot Nectar\n1/2oz Lime Juice",
				"Combine ingredients in a glass with ice. Garnish with a fresh lime slice and a sprig of mint and serve.");
		id = db.insertRecipe(
				"Are You Tough Enough?",
				"1oz Cinnamon Schnapps\n1oz Grain Alcohol\n1oz Peppermint Schnapps\n1oz Bourbon Whiskey\n1oz Tequila",
				"Using only 100 proof cold liquors, combine and mix all five liquors in a glass and drink like a shot.");
		id = db.insertRecipe(
				"Arizona Aztec",
				"2oz Tequila\n2oz Citrus Rum\n2oz Spiced Rum\n1Cup Cola",
				"Pour the gold tequila, citrus rum and spiced rum into a glass. Stir well. Fill with cola, stir again and serve.");
		id = db.insertRecipe(
				"Arizona Sunrise",
				"1 1/2oz Tequila\n1/2oz Lime Juice\n4oz Orange Juice\nGrenadine Syrup",
				"Add ice into a glass, pour grenadine over ice, add tequila, orange juice, " +
				"and lime juice into shaker with ice. Shake thourghly. Garnish with a straw, lime wedge or orange and cherry.");
		id = db.insertRecipe(
				"Arizona Sunset",
				"1 1/2oz Blanco Tequila\n1oz Triple Sec\n1/2oz Lime Juice\n4oz Orange Juice\nAlmond Liqueur",
				"Add ice to a glass. Slowly pour almond liqueur over ice until some settles on the bottom. " +
				"Add tequila, triple sec, lime juice, and orange juice into a shaker with ice, and shake thoroughly Pour over ice. " +
				"Garnish with straw, lime slice or orange and cherry.");
		id = db.insertRecipe(
				"Arthur's Day Dream",
				"2oz Gold Tequila\n1oz Lemon Juice\n1/2oz Strawberry Syrup\n3oz Strawberry Puree\n2oz Soda Water",
				"Blend briefly with three-quarters glassful of crushed ice in a glass, then add the soda water. " +
				"Serve with straws and garnish with a slice of lemon and a sugar-dipped strawberry.");
		id = db.insertRecipe(
				"Ass Kicker",
				"1oz Cinnamon Schnaps\n1oz Peppermint Schnapps\n1oz Tequila\n1oz Grain Alcohol\n1oz Vodka" +
				"\n1oz Triple Sec\n2oz Orange Juice\2oz Pineapple Juice",
				"Mix in shaker with ice. Strain and garnish with lime wedge and serve.");
		id = db.insertRecipe(
				"Assassin",
				"1/2oz Tennessee Whiskey\n1/2oz Tequila\n1/2oz Peppermint Schnapps\n3oz Chilled Cola",
				"Pour whiskey, tequila and peppermint schnapps into a shaker half-filled with ice cubes. " +
				"Shake well. Strain into a glass, fill with chilled cola and serve.");
		id = db.insertRecipe(
				"Aztec", 
				"3oz Champagne\n1oz Watermelon Schnapps\n1/2oz Gold Tequila",
				"Combine ingredients and serve.");
		id = db.insertRecipe(
				"Aztec Gold", 
				"1 1/3oz Gold Tequila\n1/2oz Banana Liqueur\n1/2oz Almond Liqueur\n1/2oz Herbal Liqueur",
				"Ice a shaker and add ingredients. Shake vigourously and strain into a chilled glass. " +
				"Garnish with a lime wheel on the rim.");
		id = db.insertRecipe(
				"Aztec Surfboard", 
				"1 1/2oz Gold Tequila\n1/2oz Brandy\n1tsp Blue Curacao Liqueur\n3oz Grapefruit Juice" +
				"\n2oz Mango Juice\n1oz Passion-Fruit Juice\n1tsp Orgeat Syrup", 
				"Shake and strain into an ice-filled glass.");
		id = db.insertRecipe(
				"Bahia Breeze",
				"1 1/2oz Tequila\n4oz Pineapple Juice\n1 1/2oz Cranberry Juice",
				"Build, in order, in a glass over ice. Garnish with a wedge of lime and serve.");
		id = db.insertRecipe(
				"Bald Estonian",
				"1oz Tequila\n1oz Cream Liqueur\n1/2oz Vodka\n1Cup Chilled Milk\n1tsp Cocoa Powder",
				"Pour the tequila, cream liqueur and vodka into a glass. Add the milk and " +
				"cocoa powder and stir everything together. Serve with a drinkstick.");
		id = db.insertRecipe(
				"Bar Bandit", 
				"1oz Gold Tequila\n1/2oz Sweet Vermouth\n1/2oz Dry Vermouth\n1/2oz Raspberry Liqueur\n1tsp Lime Juice\n4oz Cherryade",
				"Add to an ice-filled glass, and garnish with a cherry and slice of lime.");
		id = db.insertRecipe(
				"Barking Spider",
				"1 1/2oz Citrus Tequila\n1 1/2oz Blue Curacao Liqueur\n1oz 151 Rum\n1 Dash Triple Sec\n1 Dash Sweet and Sour Mix\n1oz Orange Juice",
				"Serve over ice in a glass, or blend for a frozen version.");
		id = db.insertRecipe(
				"Battering Ram",
				"2oz Vodka\n2oz Tequila\nEnergy Drink\n1Dash Lime Juice",
				"Mix vodka and tequila in a glass, fill up with ice cold energy drink and add a dash of lime. Stir and serve.");
		id = db.insertRecipe(
				"Beach Bum Shake",
				"1oz Tequila\n2oz Orange Juice\n1/3oz Vodka\n1 Dash Triple Sec",
				"Pour the tequila, orange juice, vodka and triple sec into a " +
				"shaker with crushed ice and shake for a minute. Strain and garnish with slice of lemon and serve.");
		id = db.insertRecipe(
				"Benelyn",
				"1oz Tequila\n1oz Peach Liqueur\n1oz Peach Schnapps\n1Cup Alcoholic Lemon Drink\n4oz Energy Drink\nCranberry Juice",
				"Pour the tequila, peach liqueur and peach schnapps into a tall glass. Add alcoholic lemon drink and energy drink. Top with cranberry juice and serve.");
		id = db.insertRecipe(
				"Bermuda Mai Tai",
				"1oz Tequila\n1oz Triple Sec\n1oz Peach Schnapps\n3oz Pineapple Juice\n1/2oz Light Rum\n1/2oz Dark Rum",
				"Fill a shaker about half full with ice cubes. Pour tequila, triple sec, peach schnapps, and light rum. " +
				"Fill with a equal amount of pineapple juice and shake well. Pour into a glass with crushed ice. " +
				"Top off with dark rum and stir a little. Garnish and serve.");
		id = db.insertRecipe(
				"Berta's Special",
				"2oz Tequila\n1tsp Honey\n5 Dash Orange Bitters\n1 Egg White\n1 1/2oz Lime Juice\nSoda Water",
				"Combine the tequila, honey, orange bitters, egg white and lime juice in a shaker half-filled with ice cubes. " +
				"Shake vigorously, and strain into a glass filled with ice cubes. " +
				"Fill with soda water, garnish with a slice of lime and serve.");
		id = db.insertRecipe(
				"Big Bull",
				"1/2oz Tequila\n1/2oz Coffee Liqueur",
				"Mix tequila and coffee liqueur in a glass and server with ice.");
		id = db.insertRecipe(
				"Big Red Hooter",
				"1oz Tequila\n1/3oz Almond Liqueur\n1oz Grenadine Syrup\nPineapple Juice",
				"Pour tequila and amaretto over ice into glass. " +
				"Fill with pineapple juice and top with grenadine. Garnish with a cherry and serve with a straw.");
		id = db.insertRecipe(
				"Bite of the Iguana",
				"1/2oz Tequila\n1/2 Dash Lemon-Lime Soda\n1/3oz Triple Sec\n1/3oz Vodka\n1oz Orange Juice\n1oz Sweet and Sour Mix",
				"Mix ingredients and shake. Strain and serve.");
		id = db.insertRecipe(
				"Bittersweet with a Twist",
				"2oz Tequila\n1Cup Grapefruit Juice\nSlice Lemon",
				"Add all liquid ingredients and add ice to taste. Stir well and add slice of lemon.");
		id = db.insertRecipe(
				"Black Cat",
				"1 1/2oz Tequila\n1 1/2oz Almond Liqueur",
				"Pour both ingredients into a glass and serve.");
		id = db.insertRecipe(
				"Black Tequila",
				"2/3oz Chocolate Liqueur\n2/3oz Blanco Tequila\n2/3oz Triple Sec\n1 Dash Lime Juice\nDry Sparkling Wine",
				"Shake ingredients and pour into glass. Top with dry sparkling wine and serve.");
		id = db.insertRecipe(
				"Blackberry Tequila",
				"2oz Tequila\n1oz Currant Liqueur\n1/2oz Lemon Juice",
				"Pour all ingredients into a shaker half-filled with ice cubes. Shake well. Pour contents into a glass and serve.");
		id = db.insertRecipe(
				"Blitz",
				"1/2oz Tequila\n1/2oz Orange Juice\n1/2oz Triple Sec\n1/2oz Peach Liqueur\n1/2oz Grenadine Syrup\n1/2oz Lemon Juice",
				"Shake with ice. Strain or with ice.");
		id = db.insertRecipe(
				"Bloody Hurricane",
				"1oz Tequila\n1 1/2Cup Lemon-Lime Soda\n1/2oz Grenadine Syrup",
				"Pour tequila into a glass 1/4 filled with ice cubes. " +
				"Add lemon lime soda, and splash grenadine. Allow to chill for 10 seconds. Serve.");
		id = db.insertRecipe(
				"Bloody Maria", 
				"1oz Tequila\n2oz Tomato Juice\n1 Dash Lemon Juice\n1 Dash Red Pepper Sauce\n1 Dash Celery Salt\n1 Slice Lemon",
				"Shake all ingredients (except lemon slice) with cracked ice and strain into a glass over ice cubes. Add the slice of lemon and serve.");
		id = db.insertRecipe(
				"Bloody Matador", 
				"1 1/2oz Tequila\n1oz Energy Drink\n1/2oz Triple Sec\n1 1/2oz Limeade Concentrate\n1/2oz Grenadine Syrup",
				"Combine all ingredients together in a blender. Blend until slushy. Strain into a glass or two and serve.");
		id = db.insertRecipe(
				"Bloody Tampon",
				"1 1/2oz Canadian Whiskey Liqueur\n1/2oz Lemon Juice\n1 1/2oz Tequila\n1 1/2oz Vodka\n1oz Vegetable Juice\n1oz Cream Liqueur",
				"Mix whiskey liqueur, tequila, and vodka (all chilled) in a glass. " +
				"Add room temperature vegetable juice without mixing. " +
				"Strain irish cream on top and then splash with lemon juice to curdle giving a cotton-like texture.");
		id = db.insertRecipe(
				"Blue Diablo",
				"1oz Tequila\n1 Dash Blue Curacao Liqueur\n1/2oz Lemon Juice\n1 Dash Lime Juice",
				"Color some regular salt by adding blue food dye. Salt the rim of a glass; " +
				"rub a slice of lemon and then roll the edge of the glass in a saucer full of salt. " +
				"Chill the glass. Fill the glass about 2/3 full of ice. Add tequila, lemon juice and a dash each of " +
				"both lime cordial and blue curacao. Serve while the blue curacao runs down the middle of the drink.");
		id = db.insertRecipe(
				"Blue Motorcycle",
				"1 1/2oz Tequila\n1 1/2oz Rum\n1 Dash Lemon-Lime Soda\n1 1/2oz Vodka\n1 1/2oz Gin\n1 1/2oz Blue Curacao Liqueur\nSweet and Sour Mix",
				"Build over ice in a glass. Fill with sour mix and add a splash of lemon lime soda.");
		
		db.close();
	}
	public static void setWednesdayDrinks(DBAdapter db){
		db.open();
		id = db.insertRecipe(
        		".50 Caliber",
        		"2oz Tennesee Whiskey\n2ozBourbon Whiskey\n2oz Dry Gin\n2oz Vodka\n1oz Citrus Soda",
        		"Pour the Tennessee whiskeys, gin and vodka into glass half-filled with ice cubes. Add Citrus soda and serve.");
		id = db.insertRecipe(
				"100 Miles per Hour",
				"1/2oz Bourbon Whiskey\n1/2oz 151 Rum\n1/2oz Peach Liqueur\n1/2oz Canadian Whiskey Liqueur\n1/2oz Grenadine Syrup\n2oz Blue Curacao Liqueur",
				"Mix all ingredients together over ice. Shake up, then top with lemon lime soda and serve.");
		id = db.insertRecipe(
				"6 Wise Men",
				"1oz Tennesee Whiskey\n1oz Bourbon Whiskey\n1oz Bourbon Whiskey\n1ozBourbon Whiskey\n1oz Scotch Whiskey\n1oz Irish Whiskey",
				"Pour all six whiskeys (perferably differnt makes) into glass. Add ice cubes and serve.");
		id = db.insertRecipe(
				"7&7",
				"4/5Cup Lemon-Lime Soda\n1oz Bourbon Whiskey",
				"Add Whiskey, then add lemon-lime soda.");
		id = db.insertRecipe(
				"Agent Orange",
				"1oz Canadian Whiskey Liqueur\n1oz Bourbon Whiskey\n1oz Apple Schnapps\n1oz Vodka\n1oz Light Rum\n1oz Triple Sec\n1/2oz Grenadine Syrup\n2oz Orange Juice",
				"Add ingredients with ice and stir. Garnish with cherry and orange.");
		id = db.insertRecipe(
				"All American",
				"1oz Bourbon Whiskey\n1oz Peach Liqueur\n2oz Cola",
				"Serve with two ice cubes. You can vary the amount of Cola depending on taste.");
		id = db.insertRecipe(
				"Allegheny",
				"4/5oz Bourbon\n1/2oz Dry Vermouth\n1/2Tbsp Blackberry Flavored Brandy\n1tsp Lemon Juice\nLemon Twist",
				"Shake all ingrdients but lemon twist with ice in shaker. Strain into chilled glass. Garnish with lemon twist.");
		id = db.insertRecipe(
				"Anchors Aweigh",
				"1 1/2oz Bourbon Whiskey\n2tsp Triple Sec\n2tsp Peach Brandy\n2tsp Cherry Brandy\n2Tbsp Half-And-Half",
				"Pour the bourbon whiskey, triple sec, peach brandy, cherry brandy and half-and-half " +
				"into a cocktail shaker half-filled with ice cubes. Shake well, strain and serve.");
		id = db.insertRecipe(
				"Angela The Bartender's Hooters",
				"3oz Bourbon Whiskey\n1Cup Cola",
				"Add a handful of ice cubes to a highball glass. Pour in whiskey, then add cola (pre-chilled) and serve.");
		id = db.insertRecipe(
				"Apple Manhattan",
				"2oz Bourbon Whiskey\n1oz Apple Liqueur",
				"Stir the whiskey and liqueur in a mixing glass with ice and strain into a chilled glass. Garnish with a slice of apple and serve.");
		id = db.insertRecipe(
				"Back Row Cocktail",
				"1 1/2oz Spiced Rum\n1 1/2oz Gin\n1 1/2oz Bourbon Whiskey\n1 1/2oz Triple Sec\n1 1/2oz Sweet and Sour Mix\n3oz Ginger Ale",
				"Pour all ingredients in above order into a glass half-filled with ice cubes. Stir briefly and serve.");
		id = db.insertRecipe(
				"Banana Bird",
				"1oz Bourbon Whiskey\n2tsp Banana Liqueur\n2tsp Triple Sec\n1oz Double Cream",
				"Shake with ice, strain and serve.");
		id = db.insertRecipe(
				"Basin Street",
				"2oz Bourbon Whiskey\n1oz Triple Sec\n1oz Lemon Juice",
				"Shake with cracked ice, strain and serve.");
		id = db.insertRecipe(
				"Beam 'n Squirt",
				"4oz Bourbon Whiskey\n4oz Citrus Soda",
				"Pour both ingredients over 6 ice cubes in a glass. Stir and serve.");
		id = db.insertRecipe(
				"Beam and 7",
				"3oz Bourbon Whiskey\n3oz Lemon-Lime Soda",
				"Pour whiskey into a glass filled with ice cubes. Add lemon lime soda and serve.");
		id = db.insertRecipe(
				"Beam Me Up",
				"1oz Bourbon Whiskey\n1oz Almond Liqueur\n1Cup Cola",
				"Fill cocktail glass with ice. Add bourbon whiskey and almond liqueur. Then add cola and stir.");
		id = db.insertRecipe(
				"Beam Scream",
				"1 1/2oz Cinnamon Schnapps\n1 1/2oz Bourbon Whiskey",
				"Mix shots in glass, stir, then drain it.");
		id = db.insertRecipe(
				"BeeGee OJ",
				"1 1/2oz Bourbon Whiskey\n3oz Orange Juice\n1 Dash Grenadine Syrup",
				"Pour bourbon whiskey into a glass filled with ice cubes. Add the orange juice, a little grenadine and serve.");
		id = db.insertRecipe(
				"Bessemer",
				"1/2oz Tennesse Whiskey\n1/2oz Bourbon Whiskey\n1/2oz Peach Liqueur\n2oz Sweet and Sour Mix",
				"Pour all ingredients into a mixing glass half-filled with ice cubes. Stir well. Strain into glass half-filled with ice cubes and serve.");
		id = db.insertRecipe(
				"Black Rose",
				"2oz Bourbon Whiskey\n2 Dash Bitters\n1 Dash Grenadine Syrup",
				"Pour grenadine, bitters and whiskey into a glass three-quarters filled with ice. Stir, garnish with flamed lemon peel and serve.");
		id = db.insertRecipe(
				"Bloody O.J.",
				"1/2oz Bourbon Whiskey\n1/2oz Orange Juice\n1/2oz Tomato Juice\n1 Dash Soda Water",
				"Pour ingredients over two crushed ice cubes in a glass. Stir and garnish with a bloody glove if available.");
		id = db.insertRecipe(
				"Blue Grass Cocktail",
				"2oz Bourbon Whiskey\n1oz Pineapple Juice\n1oz Lemon Juice\n1tsp Cherry Liqueur",
				"Pour all ingredients into a cocktail shaker half-filled with ice cubes. Shake well, strain into a chilled glass and serve.");
		id = db.insertRecipe(
				"Blue Lightning",
				"1/2oz Blue Curacao Liqueur\n1/2oz Peach Liqueur\n1/2oz Bourbon Whiskey\n5oz Lime Mix",
				"Pour the blue curacao, peach liqueur and whiskey into a glass almost filled with ice cubes. Fill with prepared lime mix and serve.");
		id = db.insertRecipe(
				"Blue Zero",
				"1oz Bourbon Whiskey\n1oz Orange Liqueur\n1 1/2oz Tropical Fruit Liqueur",
				"Stir ingredients together with crushed ice and serve.");
		id = db.insertRecipe(
				"Bourble",
				"2oz Bourbon Whiskey\n1/2oz Triple Sec\n1/2oz Lemon Juice",
				"In a shaker half-filled with ice cubes, combine all of the ingredients. Shake well. Strain.");
		id = db.insertRecipe(
				"Bourbon a la Creme",
				"2oz Bourbon Whiskey\n1oz Brown Creme De Cacao\n1 Vanilla Bean",
				"Pour the bourbon whiskey and brown creme de cacao over the vanilla bean in a mixing glass half-filled with ice cubes. " +
				"Stir well. Strain, and chill in the refrigerator for at least one hour. Stir well and serve.");
		id = db.insertRecipe(
				"Bourbon a la Kris",
				"3oz Bourbon Whiskey\n3oz Mango Soda",
				"Pour both ingredients into a shaker half-filled with ice cubes. Shake well, strain into a glass filled with ice cubes and serve.");
		id = db.insertRecipe(
				"Bourbon and Branch",
				"2oz Bourbon Whiskey\n4oz Mineral Water",
				"Pour the bourbon and water into a glass almost filled with ice cubes.");
		id = db.insertRecipe(
				"Bourbon and Lemon-Lime Soda",
				"2oz Bourbon Whiskey\n1/2Cup Lemon-Lime Soda",
				"Pour the bourbon into a glass with some ice cubes. Fill glass with lemon lime soda and serve.");
		id = db.insertRecipe(
				"Bourbon and Water",
				"2oz Bourbon Whiskey\n4oz Water",
				"Pour both ingredients over ice. Stir, garnish with a twist of lemon peel and serve.");
		id = db.insertRecipe(
				"Bourbon Black Hawk",
				"2oz Bourbon Whiskey\n1oz Sloe Gin\n1 Maraschino Cherry",
				"In a mixing glass half-filled with ice cubes, combine the bourbon and sloe gin. Stir and strain. Garnish with the cherry.");
		id = db.insertRecipe(
				"Bourbon Black Hawk #2",
				"2oz Bourbon Whiskey\n1oz Lemon Juice\n1/2oz Sloe Gin\n1tsp Sugar\n1 Maraschino Cherry",
				"In a shaker half-filled with ice cubes, combine the bourbon, sloe gin, lemon juice, and sugar. Shake well. Strain. Garnish with the cherry.");
		id = db.insertRecipe(
				"Bourbon Cobbler",
				"1oz Bourbon\n1/2oz Peach Liqueur\n1/2tsp Peach Brandy\n1tsp Lemon Juice\n1/3tsp Sugar\nSparkling Water\nPeach Slice",
				"Combine all ingredients, except sparkling water and peach slice with cracked ice in a shaker. Shake well. Strain into a chilled glass over ice cubes and top off with sparkling water. Stir and garnish with peach slice.");
		id = db.insertRecipe(
				"Bourbon Cobbler #2",
				"2oz Bourbon Whiskey\n3oz Club Soda\n1tsp Sugar\n1 Pineapple Wedge\n1 Lime Wedge\nStrawberries",
				"In a glass, dissolve the sugar in the club soda. Almost fill the glass with crushed ice. Add the bourbon. Garnish with strawberry, lime and pineapple wedges.");
		id = db.insertRecipe(
				"Bourbon Collins",
				"2oz Bourbon Whiskey\n1oz Lemon Juice\n4/5oz Sugar Syrup\n5oz Soda Water",
				"Pour ingredients into a frosted glass, two-thirds filled with ice. Serve with straws and garnish with a slice of orange and a cherry.");
		id = db.insertRecipe(
				"Bourbon Cooler",
				"2oz Bourbon Whiskey\n4oz Lemon-Lime Soda\n1 Lemon Wedge",
				"Pour the bourbon and the soda into a glass almost filled with ice cubes. Stir well. Garnish with the lemon wedge.");
		id = db.insertRecipe(
				"Bourbon County Cowboy",
				"2oz Bourbon Whiskey\n1/2oz Light Cream",
				"In a shaker half-filled with ice cubes, combine the bourbon and cream. Shake well. Strain.");
		id = db.insertRecipe(
				"Bourbon Crusta",
				"1 1/2oz Bourbon Whiskey\n1/2oz Orange Liqueur\n2tsp Cherry LIqueur\n1/2oz Lemon Juice\n1Tbsp Sugar\n1 Lemon Wedge",
				"Place the sugar in a saucer. Rub the rim of a blass with a lemon wedge and dip into the sugar. Fill with crushed ice. Combine the bourbon whiskey, orange " +
				"liqueur, cherry liqueur and lemon juice in a shaker. Shake well, strain into the glass, garnish with an orange peel and serve.");
		db.close();
	}
	public static void setThursdayDrinks(DBAdapter db){
		db.open();
		
		db.close();
	}
	public static void setFridayDrinks(DBAdapter db){
		db.open();
		
		db.close();
	}
	public static void setSaturdayDrinks(DBAdapter db){
		db.open();
		
		db.close();
	}
	@SuppressWarnings("unused")
	private static long id;
}
